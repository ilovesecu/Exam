package basic;

import java.util.Scanner;

//���ڻﰢ��1
/*
 �Էµ� ��(N) ��ŭ N�� N���� ���·� �������� ��µǴ� 
   ���� �簢���� ����Ͻÿ�
	4
����:   1 2 3 4 
       5 6 7 8
       9 10 11 12
       13 14 15 16 
 */
public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//���� for�� �Ƚᵵ? (������ ��øfo�� ��ŭ ���ƾ��ϱ���)
		int pow = in*in;
		for(int i=1; i<=pow; i++) {
			System.out.printf("%3d ",i);
			if(i%in == 0) {
				System.out.println("");
			}
		}
		
		//���� for��
		for(int i=0; i<in; i++) {
			for(int j=1; j<=in; j++) {
				System.out.printf("%3d ",j + (i*in));
			}
			System.out.println("");
		}
		sc.close();

	}

}
