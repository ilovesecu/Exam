package basic;

import java.util.Scanner;

//�� ���� �ִ� ����� (
public class P6 {
	public static void main(String args[]) {
		//��Ŭ����...
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while(b>0) {
			int tmp = b;
			b = a%b;
			a = tmp;
		}
		System.out.println(a);
	}
}
