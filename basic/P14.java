package basic;

import java.util.Scanner;
/*
 * �Էµ� ������ ������ ����϶�
�Է�: 421314218
����:  
0: 0
1: 3
2: 2
3: 1
4: 2
5: 0
6: 0
7: 0
8: 1
9: 0
 */
public class P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ڷ�
		int in = sc.nextInt();
		//���ڷ�
		String inStr = String.valueOf(in);
		
		//������ �迭
		int[] n = new int[10];
		//���
		while(in>0) {
			int num = in%10;
			n[num]++;
			in /= 10;
		}
		for(int i=0; i<n.length; i++) {
			System.out.printf("%d:%d\n",i,n[i]);
		}
		System.out.println("======================================");
		//���ڿ��� ���
		int[] ���ڿ��迭 = new int[10];
		char[] c = inStr.toCharArray();
		for(int i=0; i<c.length; i++) {
			int index = c[i]-48;
			���ڿ��迭[index]++;
		}
		for(int i=0; i<n.length; i++) {
			System.out.printf("%d:%d\n",i,���ڿ��迭[i]);
		}
		sc.close();
	}

}
