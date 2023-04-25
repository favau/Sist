package kr.s03.operation;

public class WhileMain03 {
	public static void main(String[] args) {
		System.out.println("===while문===");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		
		System.out.print(dan + "단");
		System.out.println("----------");
		
		int i = 1; //곱해지는 수
		while(i<=9) { //조건식
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++; //증감식
		}
		sc.close();
	}
}
