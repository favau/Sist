package kr.s02.operator;

public class OperatorMain11 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		int a = 5, b = 10;
		int max = (a>=b) ? a : b;
		int min = (a>=b) ? b : a;
		
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}

}
