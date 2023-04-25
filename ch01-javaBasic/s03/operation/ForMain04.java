package kr.s03.operation;
//for문
public class ForMain04 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("단 입력>");
		int dan = sc.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("------");
		
		for(int i=1;i<=9;i++) { //i는 곱해지는 수
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		sc.close();
	}
}
