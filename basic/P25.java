package basic;

import java.util.Scanner;

/*
N�� �־����� �� N�� ����Ŭ�� ���̸� ���Ͻÿ�
 N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
 
�Է� : 26

����: 4   (26���� 2+6 = 8 , 68 6+8 = 14  84,  8+4=12  42,  4+2 = 6 26)
*/
public class P25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int clone = n;
		int cnt = 0;
		if(n==0) {
			System.out.println("1");
		}else {
			
			while(true) {
				cnt++;
				int fir = clone/10;
				int sec = clone%10;
				int next = (fir+sec)%10;
				int complete = sec*10 + next;
				//System.out.println(complete);
				if(complete == n) {
					System.out.println(cnt);
					break;
				}
				clone = complete;
			}
			
		}
		sc.close();
	}

}
