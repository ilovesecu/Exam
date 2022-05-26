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
학생수와 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 출력하시오

입력 : 7 (학생 수) 100 95 90 80 70 60 50

정답: 57.143%
*/
public class P24 {
	public static void main(String[] args) {
		//학생 수는 입력X 점수만 입력!
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] arr = in.split(" ");
		int sum=0;
		
		//스트림 어려웡
		List<Integer> lists = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		//평균
		Double avg = lists.stream().collect(Collectors.averagingInt(Integer::intValue));
		//평균 넘은 학생 수
		long cnt = lists.stream().filter(v->v>=avg).count();
		
		
		/* IntStream으로 바꾸는 방법! (cnt가 안구해져서 폐기함)
		IntStream ints = Stream.of(arr).mapToInt(Integer::parseInt);
		sum = ints.sum();
		final double avg = sum / (arr.length * 1.0);
		long cnt = ints.filter(v->v>=avg).count();
		*/
		System.out.println(cnt*1.0/lists.size() * 100);
		sc.close();
	}

}
