package kr.s01.basic;
//묵시적 형변환
public class VariableTypeMain03 {
	public static void main(String[] args) {
		System.out.println("===묵시적 형변환(자동 형변환)===");
		
		//byte의 표현범위 : -128 ~ 127
		byte b1 = 127;
		byte b2 = 127;
		//32bit 미만 byte형 데이터를 연산하면 32bit로 승격
		int result1 = b1 + b2;
		System.out.println("result1 = " + result1);
		
		//short의 표현범위 : -32,768 ~ 32,767
		short s1 = 32767;
		short s2 = 32767;
		//32미만 short형 데이터를 연산하면 32bit로 승격
		int result2 = s1 + s2;
		System.out.println(result2);
		
		int in1 = 1234;
		long lg1 = 5678L;
		//int1이 int -> long으로 자동 형변환
		long result3 = in1 + lg1;
		System.out.println("result3 = " + result3);
	}
}
