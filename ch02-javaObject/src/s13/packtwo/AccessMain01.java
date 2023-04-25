package kr.s13.packtwo;
import kr.s13.packone.People; // 클래스 연결
public class AccessMain01 {
	public static void main(String[] args) {
		People p = new People();
		//private. 같은 클래스가 아님
		//System.out.println(p.a);
		
		//default. 같은 패키지가 아님
		//System.out.println(p.b);
		
		//protected. 같은 패키지가 아니고, 상속 관계도 아님
		//System.out.println(p.c);
		
		//public. 접근 제한이 없음
		System.out.println(p.d);
	}
}
