package kr.s18.bank;

public class BankMain {
	/*
	 * [실습]
	 * 1.일반 계좌 생성
	 * 2.입금하기
	 * 3.출금하기
	 * 4.계좌정보 출력
	 */
	public static void main(String[] args) {
		//일반 계좌 생성
		BankAccount ba = new BankAccount("100-123","1234","홍길동",10000);
		//입금하기
		ba.deposit(20000);
		//계좌정보 출력
		ba.printAccount();
		System.out.println("----------");
		//출금하기
		ba.withdraw(25000);
		//계좌정보 출력
		ba.printAccount();
		System.out.println("----------");
		//마이너스 계좌 개설
		MinusAccount ma = new MinusAccount("200-123","1234","박문수",10000,500);
		//계좌정보 출력
		ma.printAccount();
		System.out.println("----------");
		//입금하기
		ma.deposit(10000);
		//계좌정보
		ma.printAccount();
		System.out.println("----------");
		//출금하기
		ma.withdraw(20500);
		//계좌정보 출력
		ma.printAccount();
	}
}
