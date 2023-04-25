package kr.s10.trainning;

class Coffee{
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int amount; // 투입금액
	int change = 1000 ; // 거스름돈
	int changegive = 0; // 줘야하는 거스름돈
	int coffee = 10; // 초기 커피 양
	int cream = 10; // 초기 크림 양
	int sugar = 10; // 초기 설탕 양
	int count = 0; // 구매 수량
	int sellmoney = 0; // 수익
	static int menu;
	static int c=0;
	
	//메인 메뉴
	public void menu() { 
		while(true) {
			if(c == 0) {
				System.out.println("1. 커피마시기 | 2.커피 정보 보기 | 3.종료"); 
				Coffee.menu = sc.nextInt();
				menuclick(Coffee.menu);
			}else break;
		}		
	}
	
	//입력에 따라 각 번호의 메서드 호출
	public int menuclick(int a) {
		while(true) {
			if(a==1) {
				Coffee1(1);
				c=0;
				return 1;
			}else if(a==2) {
				Coffee2(); 
				c=0;
				return 2;
			}else if(a==3) {
				c=3;
				return 3;
			}else {
				System.out.println("1~3 사이의 숫자 입력");
			}
		}
	}  
	
	//1번
	public void Coffee1(int a) { 
		System.out.println("동전을 넣으세요(300원) : ");
		amount = sc.nextInt(); 
		System.out.println("구매 수량 입력 : ");
		count = sc.nextInt();
		if(amount<=0 || count<=0) { 
			System.out.println("0 이하는 불가능합니다.\n");
		}  
		if(count*300>change) {
			System.out.println("거스름돈이 부족합니다.\n");
		}else if(count*300>amount) {
			System.out.println("잔액이 부족합니다.\n");
		}else if(count>coffee) {
			System.out.println("커피가 부족합니다.\n");
		}else if(count>cream) {
			System.out.println("크림이 부족합니다.\n");
		}else if(count>sugar) {
			System.out.println("설탕이 부족합니다.\n");
		}else {
			changegive = amount - count*300; // 줘야하는 거스름돈
			change -= changegive; // 가지고 있는 거스름돈
			coffee -= count;
			cream -= count;
			sugar -= count;
			sellmoney += count*300;
			System.out.printf("거스름 돈 : %,d원\n",changegive);
			System.out.printf("커피가 %d잔 준비되었습니다.\n",count);
			System.out.println("---------------------------");
		}
	}
	
	//2번
	public void Coffee2() {
		System.out.println("커피양 : "+coffee);
		System.out.println("크림양 : "+cream);
		System.out.println("설탕양 : "+sugar);
		System.out.println("거스름돈 보유금액 : "+change);
		System.out.println("보유금액 : "+sellmoney);
		System.out.println("---------------------------");
	}
}

public class CoffeeMain {
	/*
	 * [실습]
	 * 메뉴 -> 1.커피마시기, 2.커피정보보기, 3.종료
	 * 1)커피 마시기
	 * [입력 예시]
	 * 동전을 넣으세요(300원) : 
	 * 구매 수량 입력 : 
	 * 
	 * (조건체크)
	 * 입력하는 동전과 구매 수량은 0 이하 x
	 * 거스름돈이 부족한지 여부 체크
	 * 커피가 부족한지 여부 체크
	 * 프림이 부족한지 여부 체크
	 * 설탕이 부족한지 여부 체크
	 * 
	 * (연산)
	 * 커피 차감(5)
	 * 크림 차감(3)
	 * 설탕 차감(1)
	 * 거스름돈 차감
	 * 투입한 금액 누적
	 * 
	 * [출력 예시]
	 * 거스름 돈 : **
	 * 커피가 2잔 준비되었습니다.
	 * 
	 *  2.커피 정보 보기
	 *  커피양 : *
	 *  크림양 : *
	 *  설탕양 : * 
	 *  거스름돈 보유금액 : **원
	 *  보유금액 : ***원
	 */
	public static void main(String[] args) {
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		Coffee mt = new Coffee();
		mt.menu();
		sc2.close();
		mt.sc.close();
	}
}
