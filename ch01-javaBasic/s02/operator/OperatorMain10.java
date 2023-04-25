package kr.s02.operator;
//조건(삼항) 연산자
public class OperatorMain10 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		int x = 10;
		int y = -10;
		
		//             (조건)   ? 대입1 : 대입2
		int absX = (x >= 0) ? x : -x; // T --> x대입
		int absY = (y >= 0) ? y : -y; // F --> -y대입
		System.out.println("x=10일 때, x의 절대값은 " + absX);
		System.out.println("y=-10일 때, y의 절대값은 " + absY);
	}
}
