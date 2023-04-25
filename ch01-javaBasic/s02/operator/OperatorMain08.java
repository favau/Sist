package kr.s02.operator;
//논리연산자
public class OperatorMain08 {
	public static void main(String[] args) {
	System.out.println("===논리연산자===");
	boolean a,b,result;
	a = true;
	b = false;
	
	//논리곲(&&)
	//주어진 조건들이 모두 true일 때 결과값이 true
	result = a&&b;
	System.out.println("a && b = " + result);
	
	result = a||b;
	System.out.println("a || b = " + result);
	
	result = a!=b;
	System.out.println("a != b = " + result);
	}
}
