package kr.s11.array;
import java.util.Scanner;
public class ScoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * [실습]
		 * 1.배열 생성(length 4)
		 * 2.Score 객체를 생성하고 초기화
		 * 3.객체에 저장된 정보를 출력
		 */
		int avg,sum;
		Score score = new Score();
		Score[] scoreArray = new Score[4];
		
		//Score 객체를 4개 생성해서 배열에 저장
		//각 4명의 성적 정보를 입력 받아서 객체에 저장하고
		//객체를 배열에 저장함
		for(int i=0;i<scoreArray.length;i++) {
			System.out.print("이름:");
			String name = sc.nextLine();
			System.out.print("국어:");
			int korean = sc.nextInt();
			System.out.print("영어:");
			int english = sc.nextInt();
			System.out.print("수학:");
			int math = sc.nextInt();
			sc.nextLine(); // 엔터 흡수
			scoreArray[i] = new Score(name,korean,english,math);
			System.out.println("----------");
		}
		
		/*
		scoreArray[0] = new Score("홍길동",98,96,88);
		scoreArray[1] = new Score("이순신",99,72,82);
		scoreArray[2] = new Score("장영실",97,83,81);
		scoreArray[3] = new Score("김유신",86,66,83);
		*/
		for(int i=0; i<scoreArray.length;i++) {
			System.out.println("이름 : " + scoreArray[i].getName());
			System.out.println("국어 : " + scoreArray[i].getKorean());
			System.out.println("영어 : " + scoreArray[i].getEnglish());
			System.out.println("수학 : " + scoreArray[i].getMath());
			sum = score.makeSum(scoreArray[i].getKorean(),
					scoreArray[i].getEnglish(),scoreArray[i].getMath());
			avg = score.makeAvg(sum);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("----------");
		}
		sc.close();
	}
}
