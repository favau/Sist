package kr.s02.operator;
//입력받은 정수 연산 후 출력
public class OperatorMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 키보드에서 입력한 정수값에 마지막 자릿수를
		 * 제외한 값과 마지막 자릿수를 표시
		 * (힌트)123을 입력하면 마지막 자릿수를 제외한 값은 12이고 마지막 자릿수는 3이 됨
		 * 
		 * [출력 예시]
		 * 마지막 자릿수를 제외한 값 : **
		 * 마지막 자릿수 : **
		 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 입력 : ");
		int numeral = sc.nextInt();
		int numeral1 = numeral/10;
		int numeral2 = numeral%10;
		
		System.out.println("마지막 자릿수를 제외한 값 : "+numeral1);
		System.out.print("마지막 자릿수 : "+numeral2);
		sc.close();
	}
}
