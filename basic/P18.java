package basic;

import java.util.Scanner;

/*
���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
�Է�: 5

����:  
     * 4
    ** 3
   *** 2 
  **** 1 
 ***** 0
 */
public class P18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//17�� �������� �غ���.
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(n-1-i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
