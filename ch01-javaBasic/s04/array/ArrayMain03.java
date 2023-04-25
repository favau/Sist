package kr.s04.array;
//배열
public class ArrayMain03 {
	public static void main(String[] args) {
		int sum = 0; //총점을 저장하기 위한 변수
		float average = 0.0f; //평균을 저장하기 위한 변수
		
		//배열 선언,생성,초기화
		int[] score = new int[] {100,88,88,100,90};
								 //   0   1  2   3   4
								 //length = 5
		//총점구하기
		for(int i=0; i<score.length;i++) {
			sum += score[i];
		}
		
		//평균구하기
		average = sum/(float)score.length;
		
		//결과값 출력
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", average);
		
	}
}
