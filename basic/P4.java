package basic;

import java.util.Scanner;

//10���� -> 2���� ��ȯ
public class P4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] ans = new int[100];
		int index = 0;
		while(in>1) {
			ans[index++]=in%2;
			in = in/2;
		}
		ans[index] = in;
		
		for(int i=index; i>=0; i--) {
			System.out.printf("%d ",ans[i]);
		}
	}
}
