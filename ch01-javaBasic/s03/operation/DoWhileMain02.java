package kr.s03.operation;

public class DoWhileMain02 {
	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int korean,english,math,sum;
	char grade;
	float avg;
	
	do {
		System.out.print("국어:");
		korean = sc.nextInt();
		}while(korean < 0 || korean > 100);
	do {
		System.out.print("영어:");
		english = sc.nextInt();
		}while(english < 0 || english > 100);
	do {
		System.out.print("수학:");
		math = sc.nextInt();
		}while(math < 0 || math > 100);
	
	//총점구하기
	sum = korean + english + math;
	//평균구하기
	avg = sum / 3.0f;
	//등급구하기
	switch((int)(avg/10)) {
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
	
	System.out.println(); //줄바꿈
	System.out.println("총점 = " + sum);
	System.out.printf("평균 = %.2f %c \n",avg,grade);
	sc.close();
	}
}
