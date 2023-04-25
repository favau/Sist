package kr.s03.operation;
//if기초
public class IfMain06 {
	public static void main(String[] args) {
	 /*[실습]
	 * 정수 하나를 입력하여 짝수면 10을 더하고
	 * 홀수이면 20을 더해서 결과값을 출력하시오.
	 * 
	 * [입력 예시]
	 * 정수 하나 입력 : 5
	 * 
	 * [출력 예시]
	 * 결과 : 25
	 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			a += 10;
			System.out.println(a);
		}else {
			a += 20;
			System.out.println("결과 : "+a);
		}
		sc.close();
	}
}
