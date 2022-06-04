package basic;

import java.util.Scanner;

public class zerocho {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int b=0; b<n-1-i; b++)
				System.out.print(" ");
			for(int s=0; s<i*2+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n-1; i++) {
			for(int b=0; b<i+1; b++)
				System.out.print(" ");
			for(int s=(n-1)*2-1-i; s>i; s--)
				System.out.print("*");
			System.out.println();
		}
		
		
	}
}
