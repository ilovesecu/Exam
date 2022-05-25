package basic;
/*
100±îÁö 369 °ÔÀÓÀ» ¾Æ·¡¿Í °°ÀÌ ÁøÇàÇÏ½Ã¿À.

Á¤´ä:  
1 2 Â¦ 4 5 Â¦ 7 8 Â¦ 
10 11 12 Â¦ 14 15 Â¦17 18 Â¦ 
20 21 22 Â¦ 24 25 Â¦ 27 28 Â¦ 
Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 
40 41 42 Â¦ 44 45 Â¦ 47 48 Â¦ 
50 51 52 Â¦ 54 55 Â¦ 57 58 Â¦ 
Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 
70 71 72 Â¦ 74 75 Â¦ 77 78 Â¦ 
80 81 82 Â¦ 84 85 Â¦ 87 88 Â¦ 
Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 100 
 */
public class P20 {
	//my code
	public static void main(String[] args) {
		P20 p20 = new P20();
		
		//p20.myCode(); //³» ÄÚµå
		//p20.jins(); //Áø¾²ÄÚµù (Á» ´õ ±ò²û)
	}
	// Áø¾²ÄÚµùÀº Á» ´õ ±ò²ûÇÔ.
	public int get369Cnt(int n) {
		int cnt = 0;
		while(n>0) {
			int remain = n%10;
			if(remain==3 || remain==6 || remain==9) {
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}
	public void jins() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100; i++) {
			int cnt = get369Cnt(i);
			if(cnt == 0) {
				sb.append(i);
			}else {
				while(cnt > 0) {
					sb.append("Â¦");
					cnt--;
				}	
			}
			sb.append(" ");
			if(i%10==0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	
	//³» ÄÚµå Á» ´õ ÁöÀúºÐÇÔ... ¤Ð¤Ð
	public void myCode() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100; i++) {
			int n = i;
			boolean noClap = true;
			while(n>0) {
				int j=n%10;
				if(j==3 || j==6 || j==9) {
					sb.append("Â¦");
					noClap = false;
				}
				n/=10; 
			}
			
			if(noClap) {
				sb.append(i+" ");
			}else {
				sb.append(" ");				
			}
			if(i%10 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
