package basic;

import java.util.Scanner;

/*
���� �Է� n�� m���� ����� ����Ͻÿ�
�Է�: 5 3

����:  125

Tag
 */
public class P19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//�̰Ÿ��� ȿ������ �����µ� �ֱ��Ѵ�... �����غ���
		int ans = n;
		for(int i=1; i<m; i++) {
			ans = ans * n;
		}
		System.out.println(ans);
		sc.close();
	}

}
