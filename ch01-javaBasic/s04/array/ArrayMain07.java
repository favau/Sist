package kr.s04.array;

public class ArrayMain07 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] course = {"국어","영어","수학"};
		int[] score = new int[course.length]; //0:국어,1:영어,2:수학
		int sum=0; //총점
		float avg = 0.0f; //평균
		
		//반복문을 이용하여 입력 처리
		for(int i=0;i<score.length;i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = sc.nextInt();
			}while(score[i]<0 || score[i]>100);
			//총점구하기
			sum += score[i];
		}
		//평균구하기
		avg = sum / (float)course.length;
		
		System.out.println(); //줄바꿈
		
		for(int i = 0;i<score.length;i++){
			System.out.printf("%s = %d\n",course[i],score[i]);
		}
		System.out.printf("총점 = %d\n",sum);
		System.out.printf("평균 = %.2f",avg);
		sc.close();
	}
}
