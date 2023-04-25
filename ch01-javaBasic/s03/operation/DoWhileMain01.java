package kr.s03.operation;

public class DoWhileMain01 {
	public static void main(String[] args) {
		System.out.println("===do~while문===");
		int su = 0;
		String str = "Java DoublePlus";
		
		//선 처리,후 비교
		do {
			System.out.println(str);
		}while(su++ <5); //(주의) 세미클론 생략시 오류
		
		System.out.println("----------");
		
		//int su2 = 0;
	}

}
