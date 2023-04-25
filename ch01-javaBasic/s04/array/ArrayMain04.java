package kr.s04.array;

public class ArrayMain04 {
	public static void main(String[]args) {
		//배열 선언,생성,초기화
		int[] score = new int[] {79,88,91,33,100,55,95};
	
		//배열의 첫번째 값으로 최대값을 초기화
		int max = score[0];
		//배열의 첫번째 값으로 최소값을 초기화
		int min = score[0];
	
		for(int i=1;i<score.length;i++) {
			//최대값 구하기
			if(score[i] > max) {
				max = score[i];
			}
		}
		//최대값, 최소값 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}