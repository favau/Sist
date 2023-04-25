package kr.s01.basic;
//다양한 변수 출력
public class PrintMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 유재석은 은행계좌를 가지고 있다. 계좌에
		 * 1,000원이 예금되어 있는데 오늘 325원을
		 * 송금받아서 잔고가 1,325원이 되었다.
		 * 특별이자율은 0.3이 적용되어 내일 이자 
		 * 397.5원을 받는다.
		 * 
		 * 예금자, 송금되기전 잔금, 송금된 금액,
		 * 송금이후 잔금, 내일 입금될 이자를 출력
		 * 하시오.
		 */
		int a = 1000, b = 1325;
		double c = 397.5;
		System.out.print("유재석\n");
		System.out.printf("%d\n", a);
		System.out.printf("%d\n", 325);
		System.out.printf("%d\n", b);
		System.out.printf("%.1f\n",c);
	}

}
