package basic;

import java.util.Scanner;

//�Է��� �� �ڸ��� �� ���ϱ�
public class P9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int�� �޾Ƽ� ó��
		int in = sc.nextInt();
		int tmp = in;
		int ans = 0;
		while(tmp>0) {
			ans += tmp % 10;
			tmp /= 10;
		}
		System.out.printf("int�� ó�� : %d \n",ans);
		
		//String���� �޾Ƽ� ó��
		String inStr = String.valueOf(in);
		char[] arr = inStr.toCharArray();
		ans = 0;
		for(int i=0; i<arr.length; i++) {
			ans += (int)arr[i]-48;
		}
		
		System.out.printf("String���� ó�� : %d \n",ans);
		sc.close();
	}
}
