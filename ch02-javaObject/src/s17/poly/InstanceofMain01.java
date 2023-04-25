package kr.s17.poly;
//instanceof - 상속관계에만 사용
//부모클래스
class Parent3 extends Object{
	//Object의 toString 재정의
	@Override
	public String toString() {
		return "Parent 클래스";
	}
}
//자식클래스
class Child3 extends Parent3{
	//메서드 재정의
	@Override
	public String toString() {
		return "Child 클래스";
	}
}

public class InstanceofMain01 {
	public static void main(String[] args) {
		Parent3 p = new Parent3();
		//컴파일 시 오류는 없지만 실행시 오류 발생
		//Child3 ch = (Child3)p;
		//객체           자료형
		if(p instanceof Child3) {
			Child3 ch2 = (Child3)p;
			System.out.println(ch2);
			System.out.println("-----");
		}else {
			System.out.println(p);
			System.out.println("-----");
		}
	}
}
