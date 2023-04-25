package kr.s01.basic;
//자료형 특징
public class VariableTypeMain01 {
	public static void main(String[] args) {
		System.out.println("===논리형===");
		//논리형(true,false)
		boolean b = true;
		//T,F를 숫자로 활용 -> 자바는 불가능
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");
		//문자형, 크기 : 2 byte, 표현범위 : 0 ~ 65,535
		//다국어처리를 위한 유니코드 방식
		char c1 = 'A'; 
		System.out.println("c1 = " + c1);
		
		char c2 = 65; // A에 해당하는 아스키코드값
		System.out.println("c2 = " + c2);
		
		char c3 = '\u0041'; //A를 유니코드로 표현
		System.out.println("c3 = " + c3);
		
		char c4 = '자';
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790'; //자를 유니코드로 표현
		System.out.println("c5 = " + c5);
		
		//byte, 크기 : 1byte, 표현범위 : -128 ~ 127
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		//short, 크기 : 2byte, 표현범위 : -32,768 ~ 32,767 
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4byte, 표현범위 : -2,147,483,648 ~ 2,147,483,647
		int n1 = 12345;
		System.out.println("n1 = " + n1);
		
		//long, 크기 : 8byte
		long lg = 56789;
		System.out.println("lg = " + lg);
		
		System.out.println("===실수형===");
		//float, 크기 : 4byte
		//double, 크기 : 8byte
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
	}
}
