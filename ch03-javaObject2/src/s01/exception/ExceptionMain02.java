package kr.s01.exception;
//예외처리 try catch()
public class ExceptionMain02 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//예외처리
		//예외가 발생해도 정상 종료될 수 있도록 프로그램적으로 처리하는 것을 말함
		for(int i=0;i<=array.length;i++) {
			try {
				//예외가 발생할 가능성이 있는 코드를 명시
				//만약 예외가 발생하면 예외가 발생한 코드의 실행을 멈추고 catch블럭으로 이동
				System.out.println("array[" + i + "]:" + array[i]);
				//위의 코드에서 예외가 발생하면 아래 코드는 실행되지 않음
				System.out.println("~~~~");
			
				//예외 발생 시 생성되는 예외 객체의 타입
				//                  자료형                 변수 <- 생성된 예외객체의 주소가 전달
			}catch(ArrayIndexOutOfBoundsException e) {
				//예외가 발생하면 catch블럭으로 이동
				//발생한 이유를 설명하거나 
				System.out.println("없는 인덱스");
			}
		}//end of for
		System.out.println("프로그램 끝!!");
	}
}
