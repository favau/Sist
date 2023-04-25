package kr.s16.supertest;

//부모클래스
class Parent{
	int a = 100;
	//생성자
	public Parent() {
		//부모클래스()Object의 default 생성자를 호출
		super();
	}
}
//자식클래스
class Student extends Parent{
	int b = 200;
	//생성자
	public Student() {
		//암묵적으로 부모클래스의 default 생성자를 호출
		super();
	}
}

public class SuperMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
