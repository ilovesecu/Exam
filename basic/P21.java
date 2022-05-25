package basic;

import java.util.Scanner;

/*
1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오.

입력 : 1 2 3 1 1 2 3 4 5 5

정답: 1 2 3 4 5
*/
public class P21 {

	public static void main(String[] args) {
		int[] arr = new int[101];
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] str = in.split(" ");
		
		for(int i=0; i<str.length; i++) {
			int n = Integer.parseInt(str[i]);
			if(n>100) continue;
			arr[n]=1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
