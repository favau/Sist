package kr.s03.operation;
//switch문
public class SwitchMain03 {
	public static void main(String[] arhs) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("성적 입력");
		score = sc.nextInt();
	
		if(score<0 || score>100) {
			System.out.print("성적은 0~100만 입력 가능");
			System.exit(0);
		}
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.printf("\n성적 : %d",score);
		System.out.printf("\n등급 : %c",grade);
		sc.close();
	}
}
