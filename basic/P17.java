package basic;

import java.util.Scanner;

/*
다음 입력 n을 받아 아래와 같은 *을 출력하시오
입력: 5

정답:  
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
		//진쓰코딩은 다른 방법으로 하긴함..
		// n * n 정사각형을 찍는데.. 어떤 부분은 공백을 찍고 어떤 부분은 *을 찍고 이런 방식으로 풀어나간듯 함.
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
