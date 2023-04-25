package kr.s12.extention;
//은닉화(private) - private 멤버 변수는 같은 클래스 내에서만 호출 가능
//부모클래스
class A extends Object{
	int x = 100;
	private int y = 200; //은닉화
	public int getY() {
		return y;
	}
}
class B extends A{
	int z = 300;
}
public class ExtentionMain03 {
	public static void main(String[] args) {	
	B bp = new B();
	System.out.println(bp.x);
	//private 멤버변수는 같은 클래스 내에서만 호출 가능
	//System.out.println(bp.y);
	System.out.println(bp.getY());
	System.out.println(bp.z);
	}
}
