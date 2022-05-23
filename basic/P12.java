package basic;

import java.util.Scanner;

/*
입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
4

정답:  	   1  5  9  13 
           2  6 10 14
           3  7 11 15
           4  8 12 16
 */
public class P12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//1. 배열 X
		for(int i=1; i<=in; i++) {
			for(int j=0; j<in; j++) {
				System.out.printf("%3d",i+(j*in));
			}
			System.out.println("");
		}
		System.out.println("============================");
		
		//2. 배열
		int[][] arr = new int[100][100];
		for(int i=0; i<in; i++) {
			for(int j=0; j<in; j++) {
				arr[j][i] = (i*in) + j +1;
			}
		}
		
		for(int i=0; i<in; i++) {
			for(int j=0; j<in; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
