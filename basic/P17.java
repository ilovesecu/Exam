package basic;

import java.util.Scanner;

/*
���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
�Է�: 5

����:  
*****
 ****
   ***
    **
      *
*/
public class P17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		for(int i=0; i<in; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=in; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//�����ڵ��� �ٸ� ������� �ϱ���..
		// n * n ���簢���� ��µ�.. � �κ��� ������ ��� � �κ��� *�� ��� �̷� ������� Ǯ����� ��.
		for(int i=0; i<in; i++) {
			for(int j=0; j<in; j++) {
				if(i>j) { // 0<0  0<1
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		sc.close();
	}

}
