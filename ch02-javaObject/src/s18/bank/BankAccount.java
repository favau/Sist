package kr.s18.bank;

public class BankAccount {
		/*
		 * [실습]
		 * 기본 계좌
		 * 멤버 변수 : 계좌번호(str number), 비밀번호(str password), 예금주(name), 잔고(balance)
		 * 생성자 : 인자가 있는 생성자
		 *          - "010-123 계좌가 개설되었습니다."
		 * 멤버메서드 : 
		 * 입금(deposit) - 0이하의 금액은 입금할 수 없습니다.
		 *                     "1000원이 입금되었습니다."
		 * 출금(withdraw) - 0이하의 금액은 입금할 수 없습니다.
		 *                     "1000원이 출금되었습니다."
		 * 계좌정보(printAccount) - (일반)계좌번호, 비밀번호, 예금주, 잔고
		 */
		protected String number;
		protected String password;
		protected String name;
		protected int balance;
		//생성자
		public BankAccount(String number, String password, String name, int balance) {
			this.number = number;
			this.password = password;
			this.name = name;
			this.balance = balance;
			System.out.println(number + " 계좌가 개설되었습니다.");
		}
		//예금하기
		public void deposit(int amount) {
			if(amount <= 0) {
				System.out.println("0 이하의 금액은 입금할 수 없습니다.");
				return;
			}
			balance += amount; //누적
			System.out.printf("%,d원이 입금되었습니다.\n",amount);
		}
		//출금하기
		public void withdraw(int amount) {
			if(amount <= 0) {
				System.out.println("0이하의 금액은 출금할 수 없습니다.");
				return;
			}
			balance -= amount; //차감
			System.out.printf("%,d원이 출금되었습니다.\n", amount);
	}
		//계좌정보 출력
		public void printAccount() {
			System.out.println("(일반)계좌번호 : " + number);
			System.out.println("비밀번호 : " + password);
			System.out.println("예금주 : " + name);
			System.out.printf("잔고 : %,d원\n", balance);
		
	}
}
