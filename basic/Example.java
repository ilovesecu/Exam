package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Example {
	public static void main(String args[]) throws IOException, ParseException {
        Example example = new Example();
        example.calcWorkingDays("2021-08-23","2022-08-23");
    }
    
	/********************************************************************************************** 
     * @Method 설명 : 날짜 계산  (yyyy-MM-dd)
     * @작성일 : 2022-06-14 
     * @작성자 : 정승주
     * @변경이력 : 
     **********************************************************************************************/
    public void calcWorkingDays(String sDate, String eDate)  throws IOException, ParseException{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat stringSdf = new SimpleDateFormat("yyyyMMdd");
        Date startDate = null;
        Date endDate = null;

        try{
            startDate = df.parse(sDate);
            endDate = df.parse(eDate);
        }catch(Exception e){
            e.printStackTrace();
        }
        String todayStr = stringSdf.format(startDate); //yyyy-MM-dd

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(startDate);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(endDate);

        int workDay = 0;
        int notWorkDay = 0;
        int year = cal1.get(Calendar.YEAR);
        int month = cal1.get(Calendar.MONTH) + 1; // start at 0, not 1....

        String m = month < 10 ? "0"+month : month+"";
        Map<String,Object> holidayMap = getHolidays(String.valueOf(year),m);
        int totalCnt = (int)holidayMap.get("totalCount");
        List<Map<String,Object>> holidayList = (List<Map<String,Object>>)holidayMap.get("items");

        boolean flag = true; //평일이지만 휴일일 경우 false, 그 외 true

        List<Map<String,Object>> excludeDays = new ArrayList<>();
        Map<String,Object> holidayTmp = null;

        int nextMonth = month;
        while(cal1.before(cal2)){
            if(Calendar.SATURDAY != cal1.get(Calendar.DAY_OF_WEEK) && (Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))){
                if(totalCnt > 0){
                    for(int i=0; i<holidayList.size(); i++){
                        String locDtae=String.valueOf(holidayList.get(i).get("locdate"));
                        if(locDtae.equals(todayStr)){
                            holidayTmp = new HashMap<>();
                            notWorkDay++;
                            flag=false;
                            holidayTmp.put("dateName",holidayList.get(i).get("dateName"));
                            holidayTmp.put("locdate",holidayList.get(i).get("locdate"));
                            holidayTmp.put("isHoliday",holidayList.get(i).get("isHoliday"));
                            excludeDays.add(holidayTmp);
                            break;
                        }
                    }
                }
                if(flag)workDay++;
            } else {
                notWorkDay++;
            }
            flag=true;
            cal1.add(Calendar.DATE, 1);
            todayStr = stringSdf.format(cal1.getTime()); //오늘 날짜 포맷 변경 yyyyMMdd
            nextMonth = cal1.get(Calendar.MONTH)+1; //날짜를 하루 더해줬으니까 달이 바뀌었는지 확인한다.
            if( nextMonth != month){
                month = nextMonth;

                year = cal1.get(Calendar.YEAR);
                m = month < 10 ? "0"+month : month+"";
                holidayMap = getHolidays(String.valueOf(year),m); //달이 바뀌었다면 해당 달의 공휴일 정보를 다시 가져오자.
                totalCnt = (int)holidayMap.get("totalCount");
                holidayList = (List<Map<String,Object>>)holidayMap.get("items");
            }
        }

        System.out.println("workDay:"+workDay);
        System.out.println("notWorkDay:"+notWorkDay);
        System.out.println("==========제외된 공휴일 리스트==========");
        excludeDays.stream().forEach(v->{
            System.out.println("dateName:"+v.get("dateName") + ", "+"locdate:"+v.get("locdate"));
        });
    }
    
    /********************************************************************************************** 
     * @Method 설명 : 휴일 정보 가져오기 
     * @작성일 : 2022-06-14 
     * @작성자 : 정승주
     * @변경이력 : 
     **********************************************************************************************/
    public Map<String,Object> getHolidays(String year, String month) throws IOException, ParseException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=0CckuwA4JXGq5s8nqHtlutBhsr8wf0xl7yPUS%2B4yybjSb7fYCinkb%2BL6vfqKvlTPaus%2Fc6Lltbvf0Lt8Heo18Q%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("solYear","UTF-8") + "=" + URLEncoder.encode(year, "UTF-8")); /*��*/
        urlBuilder.append("&" + URLEncoder.encode("solMonth","UTF-8") + "=" + URLEncoder.encode(month, "UTF-8")); /*��*/
        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*json, xml*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(sb.toString());
        JSONObject jsonObject = (JSONObject)obj;
        Map<String,Object> originMap = getMapFromJsonObject(jsonObject);
        Map<String,Object> holidayMap = parseHoliday(originMap);
        return holidayMap;
    }
    
    /********************************************************************************************** 
     * @Method 설명 : 변환된 Map에서 필요한 값만 꺼내서 다른 맵으로 반환
     * @작성일 : 2022-06-14 
     * @작성자 : 정승주
     * @변경이력 : 
     **********************************************************************************************/
    public Map<String,Object> parseHoliday(Map<String,Object> origin){
        Map<String,Object> parsed = new HashMap<>();
        String resultCode = (String)((Map<String,Map<String,Object>>)origin.get("response")).get("header").get("resultCode");
        int totalCount = (int)((Map<String,Map<String,Object>>)origin.get("response")).get("body").get("totalCount");
        if(totalCount > 1){
            List<Map<String,Object>> items = (List<Map<String,Object>>) ((Map<String,Map<String,Map<String,Object>>>)origin.get("response")).get("body").get("items").get("item");
            parsed.put("items",items);
        }else if(totalCount == 1){
            List<Map<String,Object>> items = new ArrayList<>();
            Map<String,Object> tmp = (Map<String,Object>)((Map<String,Map<String,Map<String,Object>>>)origin.get("response")).get("body").get("items").get("item");
            items.add(tmp);
            parsed.put("items",items);
        }
        parsed.put("totalCount",totalCount);
        parsed.put("resultCode",resultCode);
        return parsed;
    }

    /********************************************************************************************** 
     * @Method 설명 : JSON을 Map으로 변환 
     * @작성일 : 2022-06-14 
     * @작성자 : 정승주
     * @변경이력 : 
     **********************************************************************************************/
    public Map<String,Object> getMapFromJsonObject(JSONObject jsonObj){
        Map<String, Object> map = null;
        try {
            map = new ObjectMapper().readValue(jsonObj.toString(), HashMap.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return map;
    }
}
