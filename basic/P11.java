package basic;

import java.util.Scanner;

/*
 * �Էµ� ��(N) ��ŭ N�� N���� ���·� �Ʒ��� ���� ��µǴ� 
���� �簢���� ����Ͻÿ�
4

����:       1  2  3  4 
           8  7  6  5
           9  10 11 12
          16 15 14 13
 */
public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//1. �迭�� ����غ���. (���߹迭)
		int[][] arr = new int[100][100];
		
		for(int i=0; i<in; i++) {
			for(int j=1; j<=in; j++) {
				arr[i][j] = i*in + j;
			}
		}
		
		for(int i=0; i<in; i++) {
			if(i%2 == 0) {
				for(int j=1; j<=in; j++) {
					System.out.printf("%3d ",arr[i][j]);
				}
			}else {
				for(int j=1; j<=in; j++) {
					System.out.printf("%3d ",arr[i][in-j+1]);
				}
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
