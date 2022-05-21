package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

/*
1. �л��������� �����ϰ�, �л��̸�����
 �˻������� �й��� ����ϴ� ���α׷� �ۼ�.

- Student Ŭ���� ����
String name, no�� ���� (�̸��� �й�)

�л����� ArrayList�� ������ ����,
��� �˻��� �ϰڴ��� y
�����ϰ������ n

�л��̸����ִ°�� ���л��� �й��� ���
�л��̸��� ������, ���� �л��̸��̶�� ���

�±�
 while, flag, ArrayList, foreach

 */
public class P1 {
	public static void main(String args[]) {
		P1 p1 = new P1();
		Scanner sc = new Scanner(System.in);
		List<Student> stu = new ArrayList<>();
		//1. ����
		//2. �˻�
		//3. ����Ʈ ��� ���
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
		System.out.print("�л� �̸� >>");
		String name = sc.next();
		Student s = stu.stream()
				.filter(v->v.getName().equals(name))
				.findFirst()
				.orElse(null);
		if(s==null) {
			System.out.println("�������� �ʴ� �л��Դϴ�.");
		}else {
			System.out.println("ã�� �л��� �й�:"+s.getNo());
		}
	}
	private void save(Scanner sc, List<Student>stu) {
		System.out.print("�л� �̸� >>");
		String name = sc.next();
		System.out.print("�л� ��ȣ >>");
		String no = sc.next();
		if(name.trim().equals("") || no.trim().equals("")) {
			return ;
		}
		//�ߺ��˻�
		stu.stream()
			.filter(v->v.getName().equals(name))
			.findFirst()
			.ifPresentOrElse(
					student->System.out.println("�ߺ��� �̸��Դϴ�. "+student.getName()), 
					()->stu.add(new Student(name,no))
					);;
		
	}
	private void displayAll(List<Student> stu) {
		stu.stream().forEach(v->System.out.println(v.getName()+", "+v.getNo()));
	}
	private int selectMenu(Scanner sc) {
		System.out.println("====================================");
		System.out.println("1. ����     2. �˻�     3. ��� �˻�     4. ����");
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