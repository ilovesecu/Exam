package basic;

import java.util.Scanner;

//���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
//�Է�:5
public class P16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		for(int i=0; i<in; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
