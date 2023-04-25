package kr.s15.overriding;
//오버라이딩(재정의)  @Override
//부모클래스
class GrandParent{
	public String getCar() {
		return "구형 자동차";
	}
}
//자식클래스
class Father extends GrandParent{
	/*
	 * Method Overriding(메서드 재정의)
	 * 상속관계일 때 부모클래스의 메서드를 자식클래스에서 재정의
	 * 
	 * @Override 어노테이션은 메서드 재정의 문법에 맞게 재정의가 되었는지를 검증, 문법에 맞게 재정의 되지 않으면 컴파일 오류가 발생
	 */
	@Override
	public String getCar() {
		return "신형 자동차";
	}
}
//자식클래스
class Oncle extends GrandParent{
	
}
public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		System.out.println("----------");
		Oncle oc = new Oncle();
		System.out.println(oc.getCar());
	}
}
