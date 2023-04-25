package kr.s01.basic;
//변수 선언,초기화,입력,출력,연산
public class PrintMain07 {
	public static void main(String[] args) {
		//변수는 값을 저장 할 수 있는 메모리 공간
		
		//변수 선언
		int num;
		
		//변수의 초기화
		num = 17;
		
		//변수의 값 출력
		System.out.println(num);
		
		//동일한 자료형을 사용하기 때문에 두 번째 변수명 앞의 자료형은 생략 할 수 있음
		int a = 10, b = 20;
		//변수에서 값을 호출하여 연산
		int result = a+b;
		// 연산 = 숫자 + 숫자
		// 연결 = 문자열 + 숫자 -> 문자열과 숫자를 연결해서 새로운 문자열 생성
		System.out.printf("result = %d\n", result);
		System.out.println("result = " + result);
		
		//주의사항
		System.out.println("결과 : " + a + b);  //연결 - 1020
		System.out.println("결과 : " + (a + b));//연산 - 결과 : 30
		
		//변수 선언
		//int no;
		//변수 선언 후 출력 또는 연산하기 전에 반드시
		//초기화를 해야 함
		
	}
}
