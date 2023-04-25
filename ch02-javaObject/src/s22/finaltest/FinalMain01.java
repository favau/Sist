package kr.s22.finaltest;
//상수화
class A{
	//지정한 값은 변경 불가능
	final int NUM   = 10;
	//static 상수 호출 시 static 메모리 적재
	public static final int NUMBER = 20;
}
public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//상수는 변경 불가능
		//ap.NUM = 200;
		System.out.println(ap.NUM);
		System.out.println(A.NUMBER);
		
		//지역변수에는 접근지정자 사용 불가능 - 메서드에 접근지정자가 이미 있음
		final int NO = 30;
		System.out.println(NO);
	}
}
