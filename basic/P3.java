package basic;

import java.util.Scanner;

/*
 * ���� ���� ������ ���� ����Ͻÿ�.
	1 2 2 3 1 4 2 2 4 3 5 3 2
	����: 2 (5ȸ)
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
		
		int maxCnt = 1; //�ֺ���� Ƚ��
		int max = 0; //�ֺ��
		for(int i=1; i<split.length; i++) {
			System.out.print(arr[i] + " ");
			if(maxCnt < arr[i]) {
				maxCnt = arr[i];
				max = i;
			}
		}
		System.out.printf("\n�ֺ��:%d, Ƚ��:%d",max,maxCnt);
		sc.close();
	}
}
