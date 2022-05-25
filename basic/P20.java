package basic;
/*
100���� 369 ������ �Ʒ��� ���� �����Ͻÿ�.

����:  
1 2 ¦ 4 5 ¦ 7 8 ¦ 
10 11 12 ¦ 14 15 ¦17 18 ¦ 
20 21 22 ¦ 24 25 ¦ 27 28 ¦ 
¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 
40 41 42 ¦ 44 45 ¦ 47 48 ¦ 
50 51 52 ¦ 54 55 ¦ 57 58 ¦ 
¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 
70 71 72 ¦ 74 75 ¦ 77 78 ¦ 
80 81 82 ¦ 84 85 ¦ 87 88 ¦ 
¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ ¦ ¦ ¦¦ 100 
 */
public class P20 {
	//my code
	public static void main(String[] args) {
		P20 p20 = new P20();
		
		//p20.myCode(); //�� �ڵ�
		//p20.jins(); //�����ڵ� (�� �� ���)
	}
	// �����ڵ��� �� �� �����.
	public int get369Cnt(int n) {
		int cnt = 0;
		while(n>0) {
			int remain = n%10;
			if(remain==3 || remain==6 || remain==9) {
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}
	public void jins() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100; i++) {
			int cnt = get369Cnt(i);
			if(cnt == 0) {
				sb.append(i);
			}else {
				while(cnt > 0) {
					sb.append("¦");
					cnt--;
				}	
			}
			sb.append(" ");
			if(i%10==0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	
	//�� �ڵ� �� �� ��������... �Ф�
	public void myCode() {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=100; i++) {
			int n = i;
			boolean noClap = true;
			while(n>0) {
				int j=n%10;
				if(j==3 || j==6 || j==9) {
					sb.append("¦");
					noClap = false;
				}
				n/=10; 
			}
			
			if(noClap) {
				sb.append(i+" ");
			}else {
				sb.append(" ");				
			}
			if(i%10 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
