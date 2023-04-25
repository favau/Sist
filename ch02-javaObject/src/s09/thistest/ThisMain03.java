package kr.s09.thistest;
//this 캡슐화 활용
class ThisTest {
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int a) {
	 //멤버변수  지역변수
		this.a = a;
	}
	public int getA() {
		return a;
	}
}

public class ThisMain03 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}
}
