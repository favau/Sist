package kr.s18.bank;
public class MinusAccount extends BankAccount{
	/*
	 * [실습]
	 * BankAccount를 상속 받아서 마이너스 계좌의 
	 * 기능을 갖는 클래스를 정의
	 * 
	 * 멤버변수 : 한도(minusLimit)
	 * 멤버메서드 : 출금(withdraw) - 재정의
	 * 계좌정보(printAccount) - 재정의
	 */
	private int minusLimit = 100000;
	//생성자
	public MinusAccount(String number, String password, String name, int balance, int minusLimit) {
		super(number,password,name,balance);
		this.minusLimit = minusLimit;
	}
	
	//출금하기
	@Override
	public void withdraw(int amount) {
		if(amount <= 0) {
			System.out.println("0 이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance + minusLimit < amount) {
			System.out.println("한도 초과로 출금되지 않습니다.");
			return;
		}
		balance -= amount; //차감
		System.out.printf("%,d원이 출금되었습니다.\n",amount);
	}
	
	//계좌정보 출력
	@Override
	public void printAccount() {
		System.out.println("(마이너스)계좌번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : " + name);
		System.out.printf("잔고 : %,d원\n", balance);
	}
}
