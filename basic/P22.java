package basic;

import java.util.Scanner;

public class P22 {
	//�Էµ� ���� �Ӹ�������� �Ǻ�
	//�Է� : 12321 
	//����: True
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int mid = (int)str.length() / 2; //�Ҽ��� ����
		boolean isPalindrome = true;
		for(int i=0; i<mid; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
		sc.close();
	}

}
