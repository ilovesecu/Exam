package basic;

import java.util.Scanner;

//입려된 각 자릿수 합 구하기
public class P9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int로 받아서 처리
		int in = sc.nextInt();
		int tmp = in;
		int ans = 0;
		while(tmp>0) {
			ans += tmp % 10;
			tmp /= 10;
		}
		System.out.printf("int로 처리 : %d \n",ans);
		
		//String으로 받아서 처리
		String inStr = String.valueOf(in);
		char[] arr = inStr.toCharArray();
		ans = 0;
		for(int i=0; i<arr.length; i++) {
			ans += (int)arr[i]-48;
		}
		
		System.out.printf("String으로 처리 : %d \n",ans);
		sc.close();
	}
}
