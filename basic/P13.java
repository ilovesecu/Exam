package basic;

import java.util.Scanner;
/*
 * 
입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는  
숫자 사각형을 출력하시오
4
정답:  1  2  3  4 
      2  4  6  8
      3  6  9  12
      4  8 12 16
 * 
 */
public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//배열X
		for(int i=1; i<=in; i++) {
			for(int j=1; j<=in; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println("");
		}
		
		System.out.println("==================");
		//배열O
		int[][] arr = new int[100][100];
		for(int i=0; i<in; i++) {
			for(int j=0; j<in; j++) {
				arr[i][j] = (j+1) * (i+1);
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
