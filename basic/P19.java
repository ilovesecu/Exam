package basic;

import java.util.Scanner;

/*
다음 입력 n의 m승의 결과를 출력하시오
입력: 5 3

정답:  125

Tag
 */
public class P19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//이거말고 효율적인 지수승도 있긴한다... 공부해보쟝
		int ans = n;
		for(int i=1; i<m; i++) {
			ans = ans * n;
		}
		System.out.println(ans);
		sc.close();
	}

}
