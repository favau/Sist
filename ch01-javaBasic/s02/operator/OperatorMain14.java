package kr.s02.operator;
//입출력
public class OperatorMain14 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 키보드로 입력받아서
		 * 지불 금액을 출력하는 프로그램을 작성하시오.
		 * (단, 출력시에는 소수점이하는 절삭)
		 * 
		 * [입력 및 출력예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원
		 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("상품명 입력 : ");
		String a = sc.nextLine();
		System.out.print("단가 입력 : ");
		int b = sc.nextInt();
		System.out.print("판매 수량 입력 : ");
		int c = sc.nextInt();
		int d = b*c*85/100;
		System.out.printf("%s %d대의 가격은 %,d원",a,c,d);
		sc.close();
	}
}
