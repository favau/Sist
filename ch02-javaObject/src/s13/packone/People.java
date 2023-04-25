package kr.s13.packone;
//접근 제한자
public class People {
	//같은 클래스에서만 호출 가능
	private int a = 10;
	//같은 패키지에서만 호출 가능
	int b = 20;
	//같은 패키지나 상속 관계에서만 호출 가능
	protected int c = 30;
	//접근 제한이 없음
	public int d = 40;
}
