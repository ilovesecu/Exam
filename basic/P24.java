package basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
�л����� �������� ������� �Էµȴ�. ��պ��� ���� �л����� ������ ����Ͻÿ�

�Է� : 7 (�л� ��) 100 95 90 80 70 60 50

����: 57.143%
*/
public class P24 {
	public static void main(String[] args) {
		//�л� ���� �Է�X ������ �Է�!
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] arr = in.split(" ");
		int sum=0;
		
		//��Ʈ�� �����
		List<Integer> lists = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		//���
		Double avg = lists.stream().collect(Collectors.averagingInt(Integer::intValue));
		//��� ���� �л� ��
		long cnt = lists.stream().filter(v->v>=avg).count();
		
		
		/* IntStream���� �ٲٴ� ���! (cnt�� �ȱ������� �����)
		IntStream ints = Stream.of(arr).mapToInt(Integer::parseInt);
		sum = ints.sum();
		final double avg = sum / (arr.length * 1.0);
		long cnt = ints.filter(v->v>=avg).count();
		*/
		System.out.println(cnt*1.0/lists.size() * 100);
		sc.close();
	}

}
