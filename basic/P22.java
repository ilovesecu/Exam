package basic;

import java.util.Scanner;

public class P22 {
	//입력된 수가 팰린드롬인지 판별
	//입력 : 12321 
	//정답: True
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int mid = (int)str.length() / 2; //소수점 버림
		boolean isPalindrome = true;
		for(int i=0; i<mid; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
		sc.close();
	}

}
