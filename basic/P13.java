package basic;

import java.util.Scanner;
/*
 * 
�Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ�  
���� �簢���� ����Ͻÿ�
4
����:  1  2  3  4 
      2  4  6  8
      3  6  9  12
      4  8 12 16
 * 
 */
public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//�迭X
		for(int i=1; i<=in; i++) {
			for(int j=1; j<=in; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println("");
		}
		
		System.out.println("==================");
		//�迭O
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
