package kr.s09.thistest;

public class ThisMain02 {
	public ThisMain02() {
		System.out.println("객체 생성 : " + this);
	}
	public static void main(String[] args) {
		ThisMain02 tm = new ThisMain02(); 
		//new ThisMain02 -> tm : 객체의 주소(reference)를 넣어줌
		System.out.println("객체 생성 후 : " + tm);
	}
}
