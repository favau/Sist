package kr.s03.method;

class Account{
	String account_num;
	String name;
	int balance;
	public void deposite(int n) {
		balance += n;
		System.out.println("입금이 완료되었습니다.");
	}
	public void withdraw(int n) {
		balance -= n;
		System.out.println("출금이 완료되었습니다.");
	}
	public void printAccount() {
		System.out.println("계좌번호 : "+account_num);
		System.out.println("예금주 : "+name);
		System.out.println("잔고 : "+balance);
	}
}
public class BankMain {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Account mt = new Account();
		mt.account_num = "110-000-000000";
		mt.name = "김정연";
		mt.balance = 0;
		int n = 0, m = 0;;
		while(true) {
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			n = sc.nextInt();
			if(n==1) {
				System.out.println("입금할 금액 입력 : ");
				m = sc.nextInt();
				mt.deposite(m);
			}else if(n==2) {
				System.out.println("출금할 금액 입력 : ");
				m = sc.nextInt();
				if(m>mt.balance) {
					System.out.println("잔액이 부족합니다.");
				}else {
					mt.withdraw(m);
				}
			}else if(n==3) {
				System.out.printf("통장의 잔액은 %,d원 입니다\n",mt.balance);
			}else if(n==4) {
				break;	
			}else {
				System.out.println("잘못 입력하였습니다.");
				}
		}
	}
}

/*
 * [실습]
 * Account
 * 1)멤버변수 : 계좌번호(account_num), 예금주(name),
 * 잔고(balance)
 * 2)멤버메서드:
 * -예금하기(deposite) : balance의 값 누적
 * 예금 처리 후 "입금이 완료되었습니다.
 * -출금하기(withdraw) : balance의 값 차감
 * 출금 처리 후 "출금이 완료되었습니다." 문구 출력
 * -계좌정보 출력(printAccount) : 계좌번호, 예금주, 잔고 출력
 * 
 * BankMain main
 * 1)Account 생성
 * 2)계좌 기본 정보 입력 : 계좌번호,예금주,잔고
 * 3)while(true)형식으로 반복문 안에 메뉴
 * (1.예금 | 2.출금 | 3.잔고확인 | 4.종료)
 */
