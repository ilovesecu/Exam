package basic;

import java.util.Scanner;

//�Էµ� �� �Ҽ��Ǻ�
public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int sqrt = (int) Math.sqrt(in);
		boolean flag = true;
		for(int i=2; i<=sqrt; i++) {
			if(in % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.printf("%d�� �Ҽ��Դϴ�.",in);
	}
}
