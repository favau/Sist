package kr.s03.operation;
//for문
public class ForMain06 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		
		char c = 'a';
		for(int i=0;i<26;i++) {
			// 'a'부터 26개의 문자를 출력
			System.out.print(c++ + "\t");
		}
			System.out.println(); //단순 줄바꿈
			
		char d = 'A';
		for(int i=0;i<10;i++) {
			//'A'부터 10개의 문자를 출력
			System.out.print(d++ + "\t");
		}
		char e = '0';
		for(int i=0;i<10;i++) {
			//'0'부터 10개의 문자를 출력
			System.out.print(e++ + "\t");
		}
	}
}
