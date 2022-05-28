package basic;

import java.util.Scanner;

/*
N이 주어졌을 때 N의 사이클의 길이를 구하시오
 N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 
입력 : 26

정답: 4   (26시작 2+6 = 8 , 68 6+8 = 14  84,  8+4=12  42,  4+2 = 6 26)
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
