package basic;

import java.util.Scanner;

/*
 * 가장 많이 출현한 수를 출력하시오.
	1 2 2 3 1 4 2 2 4 3 5 3 2
	정답: 2 (5회)
 */
public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");
		int[] arr = new int[100];
		for(int i=1; i<split.length; i++) {
			int index = Integer.parseInt(split[i]);
			arr[index] = arr[index] + 1;
		}
		
		int maxCnt = 1; //최빈수의 횟수
		int max = 0; //최빈수
		for(int i=1; i<split.length; i++) {
			System.out.print(arr[i] + " ");
			if(maxCnt < arr[i]) {
				maxCnt = arr[i];
				max = i;
			}
		}
		System.out.printf("\n최빈수:%d, 횟수:%d",max,maxCnt);
		sc.close();
	}
}
