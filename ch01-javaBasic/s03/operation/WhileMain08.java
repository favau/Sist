package kr.s03.operation;
//while문 실습
public class WhileMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 커피전문점에서 아메리카노가 4,000원입니다.
		 * 마실 커피 수량을 정하고 돈을 지불하세요.
		 * 
		 * [입력 예시]
		 * 구매 수량 입력 : 1
		 * 내가 지불한 금액 : 5000
		 * or
		 * 내가 지불한 금액 : 3000
		 * 
		 * [출력 예시]
		 * 거스름돈은 1,000원입니다.(반복문을 빠져나감)
		 * or
		 * 1,000원이 부족합니다. (계속 반복)
		 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int price = 4000; //커피 단가
		int quantity; //수량
		int balance; //거스름돈
		int payment; //내가 지불한 돈
		int total; //총 지불해야 할 금액
		

		
		while(true) {
			System.out.print("구매 수량 입력 : ");
			quantity = sc.nextInt();
			total = price * quantity;
			System.out.print("내가 지불한 금액 : ");
			payment = sc.nextInt();
			
			if(total-payment<=0) { //무조건 거스름돈 받아야 하는 상황
				balance = payment - total;
				System.out.printf("거스름돈은 %,d원입니다.\n",balance);
				break;
			}
			else if(total-payment>0) { // 돈을 더 지불해야 하는 상황
				total -= payment;
				System.out.printf("%,d원이 부족합니다.\n",total);
			}
		}
		sc.close();
	}
}
