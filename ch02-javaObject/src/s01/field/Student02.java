package kr.s01.field;

public class Student02 {
	//멤버 변수
	String name;
	int age;
	String hobby;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student02 student = new Student02();
		
		//객체의 멤버 변수 값 출력
		//rorcp 생성시에 멤버 변수의 값을
		//String은 null로 int는 0으로 초기화함
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.hobby);
		System.out.println("----------");
		
		//원하는 값으로 멤버 변수 값 변경
		System.out.println(student.name+","+student.age+","+student.hobby);
	}
}
