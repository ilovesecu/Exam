package basic;

import java.util.Scanner;

//�빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ
public class P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] c = input.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]>=65 && c[i]<=90) {
				c[i] = (char)(c[i] + 32);
			}else if(c[i]>=97 && c[i]<=122) {
				c[i] = (char)(c[i] - 32);
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.printf("%c",c[i]);
		}
		sc.close();
	}
}
