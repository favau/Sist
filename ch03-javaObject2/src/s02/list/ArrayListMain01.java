package kr.s02.list;
import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A클래스";
	}
}
class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ArrayList에 객체 저장
		list.add(new A());
		list.add(new B());
		list.add("박문수");
		list.add(100);
		
		//ArrayList에 저장된 요소의 목록
		System.out.println(list);
	}
}
