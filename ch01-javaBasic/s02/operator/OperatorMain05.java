package kr.s02.operator;
//스캐너로 입력받기
public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("국어:");
		int kor = input.nextInt();
		System.out.print("영어:");
		int eng = input.nextInt();
		System.out.print("수학:");
		int math = input.nextInt();
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		System.out.println("국어 = "+kor);
		System.out.println("영어 = "+eng);
		System.out.println("수학 = "+math);
		System.out.println("총점 = "+sum);
		System.out.printf("평균 = %.2f",avg);
		input.close();
	}
};