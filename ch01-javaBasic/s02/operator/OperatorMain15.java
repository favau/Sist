package kr.s02.operator;

public class OperatorMain15 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//대입연산자를 사용하는 은행 프로그램
		int balance = 0; //잔고
		
		System.out.print("예금액>");
		balance += sc.nextInt();
		
		System.out.printf("잔고 : %,d원\n",balance);
		
		System.out.print("출금액>");
		//차감
		balance -= sc.nextInt();
		sc.close();
	}
}
