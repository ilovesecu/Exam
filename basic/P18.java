package basic;

import java.util.Scanner;

/*
다음 입력 n을 받아 아래와 같은 *을 출력하시오
입력: 5

정답:  
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
		//17번 진쓰껄로 해보자.
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
