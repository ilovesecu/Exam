package basic;

import java.util.Scanner;

//입력된 수 소수판별
public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int sqrt = (int) Math.sqrt(in);
		boolean flag = true;
		for(int i=2; i<=sqrt; i++) {
			if(in % i == 0) {
				System.out.println("소수가 아닙니다.");
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.printf("%d는 소수입니다.",in);
	}
}
