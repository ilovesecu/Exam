package basic;

import java.util.Scanner;
/*
 * 입력된 숫자의 개수를 출력하라
입력: 421314218
정답:  
0: 0
1: 3
2: 2
3: 1
4: 2
5: 0
6: 0
7: 0
8: 1
9: 0
 */
public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자로
		int in = sc.nextInt();
		//문자로
		String inStr = String.valueOf(in);
		
		//저장할 배열
		int[] n = new int[10];
		//계산
		while(in>0) {
			int num = in%10;
			n[num]++;
			in /= 10;
		}
		for(int i=0; i<n.length; i++) {
			System.out.printf("%d:%d\n",i,n[i]);
		}
		System.out.println("======================================");
		//문자열로 계산
		int[] 문자열배열 = new int[10];
		char[] c = inStr.toCharArray();
		for(int i=0; i<c.length; i++) {
			int index = c[i]-48;
			문자열배열[index]++;
		}
		for(int i=0; i<n.length; i++) {
			System.out.printf("%d:%d\n",i,문자열배열[i]);
		}
		sc.close();
	}

}
