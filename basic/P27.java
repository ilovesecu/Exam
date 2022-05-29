package basic;

import java.util.Scanner;

/*
 * 입력 n에 따른 달팽이 모양의 숫자를 출력하시오

예제 입력: 5

출력
1   2  3  4  5
16 17 18 19  6
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9
 * 
 */
public class P27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int r = 0 ,c = -1;
		int key = n; //각 단계별 반복해야할 갯수
		
		int number = 1; 
		
		while(key>0) {
			c++;
			for(int i=0; i<key; i++) {
				arr[r][c++] = number++;
			}
			
			c--;key--;r++;
			for(int i=0; i<key; i++) {
				arr[r++][c] = number++;
			}
			r--;
			for(int i=0; i<key; i++) {
				arr[r][--c] = number++;
			}
			key--;
			for(int i=0; i<key; i++) {
				arr[--r][c] = number++;
			}
			
		}
		
		
		
		for(r=0; r<arr.length; r++) {
			for(c=0;c<arr[r].length; c++) {
				System.out.printf("%3d",arr[r][c]);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}

/*
// →
		for(c=0; c<key; c++) {
			arr[r][c] = number++;  
		}
		// ↓
		key--; c--;
		for(r=0; r<key; r++) {
			arr[r+1][c] = number++;	
		}
		
		//←
		for(c=key-1; c>=0; c--) {
			arr[r][c] = number++;	
		}
		
		//↑
		key--; c++;
		for(r=key; r<key; r--) {
			arr[r][c] = number++;
		}
 */