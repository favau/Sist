package kr.s04.array;
//배열의 선언 방법들
public class ArrayMain02 {
	public static void main(String[] args) {
		//배열 선언 및 생성
		int[] array = new int[5];
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:" + array[i]);
		}
		
		System.out.println("----------");
		
		//배열의 요소 변경
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//반복문을 이용한 배열의 요소 출력
		for(int i=0; i<array.length;i++) {
			
		}
		
	}
}
