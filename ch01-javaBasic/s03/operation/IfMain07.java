package kr.s03.operation;
//if실습
public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 두 개를 입력 받아서 변수에 저장하고
		 * 두 값 중 최대값과 최소값을 구하여 최대값과 최소값을 출력하시오.
		 * (단, 같은 숫자를 입력하면 "두 수는 같다")
		 *
		 * [입력 예시]
		 * 첫번째 정수 입력 : 2
		 * 두번째 정수 입력 : 3
		 * 
		 * [출력 예시]
		 * 최대값 : 3
		 * 최소값 : 2
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		if(a>b) System.out.printf("최대값 : %d\n최소값 : %d",a,b);
		else if(a<b) System.out.printf("최대값 : %d\n최소값 : %d",b,a);
		else System.out.println("두 수는 같다.");
		sc.close();
	}
}
