package basic;

import java.util.Scanner;

//팩토리얼을 구하시오.
public class P8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		//loop
		int factorial = 2;
		for(int i=3; i<=in; i++) {
			factorial *= i;
		}
		System.out.printf("factorial loop:%d \n",factorial);
		System.out.printf("factorial recur:%d \n",recursive(in));
		
	}
	
	public static int recursive(int in) {
		if(in==2) {
			return 2;
		}
		return in * recursive(in-1);
	}
}
