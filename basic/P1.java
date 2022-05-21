package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

/*
1. 학생정보들을 저장하고, 학생이름으로
 검색했을때 학번을 출력하는 프로그램 작성.

- Student 클래스 생성
String name, no를 가짐 (이름과 학번)

학생들을 ArrayList에 저장한 이후,
계속 검색을 하겠느냐 y
종료하고싶으면 n

학생이름이있는경우 그학생의 학번을 출력
학생이름이 없으면, 없는 학생이름이라고 출력

태그
 while, flag, ArrayList, foreach

 */
public class P1 {
	public static void main(String args[]) {
		P1 p1 = new P1();
		Scanner sc = new Scanner(System.in);
		List<Student> stu = new ArrayList<>();
		//1. 저장
		//2. 검색
		//3. 리스트 모두 출력
		while(true) {
			int select = p1.selectMenu(sc);
			switch(select) {
			case 1:
				p1.save(sc,stu);
				break;
			case 2:
				p1.search(sc, stu);
				break;
			case 3:
				p1.displayAll(stu);
				break;
			case 4:
				return ;
			default:
				break;	
			}
		}
	}
	private void search(Scanner sc, List<Student> stu) {
		System.out.print("학생 이름 >>");
		String name = sc.next();
		Student s = stu.stream()
				.filter(v->v.getName().equals(name))
				.findFirst()
				.orElse(null);
		if(s==null) {
			System.out.println("존재하지 않는 학생입니다.");
		}else {
			System.out.println("찾는 학생의 학번:"+s.getNo());
		}
	}
	private void save(Scanner sc, List<Student>stu) {
		System.out.print("학생 이름 >>");
		String name = sc.next();
		System.out.print("학생 번호 >>");
		String no = sc.next();
		if(name.trim().equals("") || no.trim().equals("")) {
			return ;
		}
		//중복검사
		stu.stream()
			.filter(v->v.getName().equals(name))
			.findFirst()
			.ifPresentOrElse(
					student->System.out.println("중복된 이름입니다. "+student.getName()), 
					()->stu.add(new Student(name,no))
					);;
		
	}
	private void displayAll(List<Student> stu) {
		stu.stream().forEach(v->System.out.println(v.getName()+", "+v.getNo()));
	}
	private int selectMenu(Scanner sc) {
		System.out.println("====================================");
		System.out.println("1. 저장     2. 검색     3. 모두 검색     4. 종료");
		System.out.println("====================================");
		return sc.nextInt();
	}
	
}

class Student{
	private String name;
	private String no;
	
	
	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	
	
}