package kr.s03.operation;

public class TrainingMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재 년도 - 태어난 년도) - (생일이 지났으면 0, 지나지 않았으면 1)
		 * 
		 * [입력 예시]
		 * 출생연도 입력 : 2000
		 * 월 입력 : 3
		 * 일 입력 : 12
		 * 
		 * [출력 예시]
		 * 만 나이는 22
		 * 
		 */
		//현재 날짜 정보
		int thisYear = 2023;
		int thisMonth = 03;
		int thisDate = 21;
		int yourYear=0,yourMonth=0,yourDate=0;
		int age;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("출생연도 입력 : ");
		yourYear = sc.nextInt();
		System.out.println("월 입력 : ");
		yourMonth = sc.nextInt();
		System.out.println("일 입력 : ");
		yourDate = sc.nextInt();
		
		age = thisYear - yourYear;
		if(yourMonth<=thisMonth && yourDate < thisDate) {
			age--;
		}
		System.out.println("만 나이는 " + age);
		
		sc.close();
	}
}
