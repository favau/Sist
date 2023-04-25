package kr.s03.operation;

public class WhileMain06 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a, total = 0;
		System.out.println("0 전까지 입력받은 정수로 합 구하기");


		while(true) {
			System.out.print("누적할 정수 입력>");
			a = sc.nextInt();
			total += a;
			if(a==0) {
				break; //반복문을 빠져나감
			}
		}
		System.out.print("total = " + total);
		sc.close();
	}
}
