package kr.s03.operation;
//while문
public class WhileMain05 {
	public static void main(String[] args) {
		System.out.println("===while문===");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		System.out.print("누적할 정수 데이터 입력 : ");
		
		while((a=sc.nextInt()) !=0) {
			total += a;
			System.out.print("누적할 정수 데이터 입력 : ");
		}
		System.out.println("total = " + total);
		sc.close();
	}
}
