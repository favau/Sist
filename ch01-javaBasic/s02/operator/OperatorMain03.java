package kr.s02.operator;

public class OperatorMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 변수 선언시 자료형은 모두 int
		 * 변수 korean,english,math를 선언하고
		 * 90,95,88 으로 초기화
		 * 총점을 구해서 sum에 저장, 평균을 구해서
		 * 변수 avg에 저장
		 * 국어,영어,수학,총점,평균을 출력하시오.
		 */
		int kr = 90, en = 95, math = 88;
		int sum,avg;
		sum = 90 + 95 + 88;
		avg = sum / 3;
		System.out.printf("국어 = %d\n영어 = %d\n수학 = %d\n총점 = %d\n평균 = %d",kr,en,math,sum,avg);
	}
}
