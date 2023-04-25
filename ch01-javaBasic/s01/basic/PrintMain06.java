package kr.s01.basic;
//printf 응용
public class PrintMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * System.out.print()를 이용하여 아래와 같이 출력하라.
		 * 
		 * 국어 : 98점
		 * 영어 : 97점
		 * 총점 : 195점
		 * 평균 : 97.5점
		 */
		
		System.out.printf("국어 : %d점\n", 98);
		System.out.printf("영어 : %d점\n", 97);
		System.out.printf("총점 : %d점\n", 195);
		System.out.printf("평균 : %.1f점\n",97.5);
	}
}
