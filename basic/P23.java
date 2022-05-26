package basic;

import java.util.Scanner;

/*
입력된 문자열을 뒤집어서 출력하시오
입력 : ADEFH
정답: HFEDA
 */
public class P23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char[] arr = in.toCharArray();
		char[] reverse = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			reverse[i] = arr[arr.length - 1 - i];
		}
		
		//굳이 배열2개 안써도 되긴함.
		char tmp = ' ';
		for(int i=0; i<arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		System.out.println(reverse);
		System.out.println(arr);
		sc.close();
	}

}
