package kr.s03.operation;
//continue
public class ContinueMain {
	public static void main(String[] args) {
		System.out.println("===continue문===");
		for(int i=0;i<=10;i++) {
			
			//*특정 조건*일 때 수행문의 실행을 멈추고 다음 반복 회차로 건너뜀
			if(i%3==0) { //3의 배수
				continue;
			}
			System.out.println(i);
		} 
	}
}
 