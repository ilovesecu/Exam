package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//피보나치 수열 출력
public class P2 {
	List<Integer> arr;
	
	public P2() {
		arr = new ArrayList<>();
		arr.add(0); //0
		arr.add(1); //1
		arr.add(1); //2
	}
	public static void main(String args[]) {
		P2 p2 = new P2();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = p2.loop(a);
		System.out.println(ans);
		sc.close();
		
		int prev1=1; // -2
		int prev2=1; // -1
		for(int i=3; i<=a; i++) {
			ans = prev1+prev2;
			prev1 = prev2;
			prev2 = ans;
		}
		System.out.println(ans);
	}
	
	public int loop(int num) {
		//A(n) = A(n-1) + A(n-2)
		for(int i=3; i<=num;i++) {
			int tmp = arr.get(i-1) + arr.get(i-2);
			arr.add(tmp);
		}
		return arr.get(num);
	}
	
}
