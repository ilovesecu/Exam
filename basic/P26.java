package basic;

import java.util.Scanner;

/*
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, 
����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ��
2908 ����

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
