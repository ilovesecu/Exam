package basic;

import java.util.Scanner;

/*
������ ���� s���� f�ܱ��� �Է� �޾� �Ʒ��� ���� ����Ͻÿ�
�Է�: 2 3
����:  
2 * 1 = 2    3 * 1 = 3
2 * 2 = 4    3 * 2 = 6
2 * 3 = 6    3 * 3 = 9
2 * 4 = 8    3 * 4 = 12
2 * 5 = 10  3 * 5 = 15
2 * 6 = 12  3 * 6 = 18
2 * 7 = 14  3 * 7 = 21
2 * 8 = 16  3 * 8 = 24
2 * 9 = 18  3 * 9 = 27
*/
public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int ed = sc.nextInt();
		
		for(int j=1; j<=9; j++) {
			for(int i=st; i<=ed; i++) {	
				System.out.printf("%d * %d = %d \t",i,j,i*j);
			}
			System.out.println("");
		}
	}

}
