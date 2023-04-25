package kr.s03.method;
//변수는 클래스 위로 올리고
//객체로 호출
class Worker{
	int money,balance;
	String name = "홍길동";
	public void work() {
		money += 1000;
	}
	
	public void deposite() {
		balance += money;
		money = 0;
	}
}
public class WorkerMain {
	/*
	 * [실습]
	 * Worker
	 * 1)멤버변수 : 직원 이름(name), 급여(money), 계좌 잔고(balance)
	 * 2)멤버메서드 : 
	 * work(실행하면 money에 1000원 누적)
	 * deposite(실행하면 money의 돈을 balance에 누적시키고 money는 0으로 처리)
	 * 
	 * WorkerMain의 main메서드
	 * 1)Worker 객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일하는데 번 돈이 3000원 일 때마다 계좌에 저축
	 * 4)직원이름, 현재 계좌에 입금되지 않고 남아 있는 급여(money), 계좌 잔고(balance)를 출력하시오.
	 */
	public static void main(String[] args) {
		//객체 선언 및 생성
		Worker mt = new Worker();
		mt.name = "홍길동";
		for(int i=0;i<10;i++) {
			mt.work();
			if(mt.money == 3000) {
				mt.deposite();
			}
		}
		System.out.println(mt.name);
		System.out.println(mt.money);
		System.out.println(mt.balance);
	}
}
