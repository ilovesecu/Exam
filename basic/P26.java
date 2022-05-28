package basic;

import java.util.Scanner;

/*
상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것
2908 백준

*/
public class P26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f=sc.nextInt();
		int s=sc.nextInt();
		
		
		int n1=f;
		int n2=s;
				
		int i=0;
		int j=0;
		while((i = n1%10) > 0) {
			j = n2 % 10;
			if(i==j) {
				n1 /= 10;
				n2 /= 10;
				continue;
			}
			if(i < j) {
				while(s>0) {
					System.out.printf("%d",s%10);
					s/=10;
				}
				break;
			}else { // i >j
				while(f>0) {
					System.out.printf("%d",f%10);
					f/=10;
				}
				break;
			}
		}
		sc.close();

	}

}
