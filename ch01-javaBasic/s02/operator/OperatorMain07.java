package kr.s02.operator;
//비교연산자
public class OperatorMain07 {
	public static void main(String[] args) {
		
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a<b;
		System.out.println("a < b : " + result);
		
		result = a>b;
		System.out.println("a < b : " + result);
		
		result = a<=b;
		System.out.println("a <= b : " + result);
		
		result = a==b;
		System.out.println("a == b : " + result);
		
		result = a!=b;
		System.out.println("a != b : " + result);
	}
}
