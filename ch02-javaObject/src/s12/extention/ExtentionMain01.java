package kr.s12.extention;
//상속

//부모클래스
class Parent extends Object{ //기본적으로 생략, 자동적으로 object가 parent에 상속됨
	int a = 100;
}
//자식클래스
//부모클래스가 자식클래스에 상속됨
class Child extends Parent{
	int b = 200;
}
public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}