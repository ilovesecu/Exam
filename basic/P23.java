package basic;

import java.util.Scanner;

/*
�Էµ� ���ڿ��� ����� ����Ͻÿ�
�Է� : ADEFH
����: HFEDA
 */
public class P23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char[] arr = in.toCharArray();
		char[] reverse = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			reverse[i] = arr[arr.length - 1 - i];
		}
		
		//���� �迭2�� �Ƚᵵ �Ǳ���.
		char tmp = ' ';
		for(int i=0; i<arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		System.out.println(reverse);
		System.out.println(arr);
		sc.close();
	}

}
