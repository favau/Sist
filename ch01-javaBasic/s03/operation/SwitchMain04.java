package kr.s03.operation;
//switch문
public class SwitchMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 두 개의 정수와 연산자를 입력받은 후 연산의 결과를 출력하시오.
		 * 
		 * [입력 예시]
		 * 첫번째 수: 10
		 * 연산자: + (input.next())
		 * 두번째 수 : 20
		 * 
		 * [출력 예시]
		 * 10 + 20 = 30
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b,c=0;
		String ac;
		a = sc.nextInt();
		ac = sc.next();
		b = sc.nextInt();
			
		switch(ac) {
		case "+":
			c = a + b;
			break;
		case "-":
			c = a - b;
			break;
		case "*":
			c = a * b;
			break;
		case "/":
			if(b!=0) {
				c = a / b;
				break;
			}else {
				System.out.println("0으로 나눌 수 없습니다."); 
				System.exit(0);
			}
		case "%":
			c = a % b;
			break;
		default :
			System.out.println("잘못된 연산자 입력");
			System.exit(0);
		}
		System.out.println("");
		System.out.printf("%d %s %d = %d",a,ac,b,c);
		sc.close();
	}
}
