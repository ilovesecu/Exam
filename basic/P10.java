package basic;

import java.util.Scanner;

//숫자삼각형1
/*
 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 
   숫자 사각형을 출력하시오
	4
정답:   1 2 3 4 
       5 6 7 8
       9 10 11 12
       13 14 15 16 
 */
public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		//이중 for문 안써도? (어차피 중첩fo문 만큼 돌아야하긴함)
		int pow = in*in;
		for(int i=1; i<=pow; i++) {
			System.out.printf("%3d ",i);
			if(i%in == 0) {
				System.out.println("");
			}
		}
		
		//이중 for문
		for(int i=0; i<in; i++) {
			for(int j=1; j<=in; j++) {
				System.out.printf("%3d ",j + (i*in));
			}
			System.out.println("");
		}
		sc.close();

	}

}
