package kr.s02.operator;
//증감연산자
//패키지가 다르면 클래스명이 겹쳐도 됨
public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("===증감연산자===");
		//증가연산자
		int i=5;
		System.out.println(++i);
		System.out.println("----------");
		
		//증가연산자를 변수 뒤에 명시하면 변수값을 먼저 읽어오고 메모리의 변수 값을 1 증가시킴
		// 증가된 값을 보기 위해서는 한 번 더 호출해야 함
		System.out.println(i++); //6
		System.out.println(i); //7
		int j=10;
		System.out.println(--j);//9
		System.out.println("----------");
		
		System.out.println(j--);//9
		System.out.println(j);//8
	}
}
