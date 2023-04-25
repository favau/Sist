package kr.s04.array;
//string -> int 변환 Integer.parseInt(변수명);
public class ArrayMain09 {
	public static void main(String[] args) {
	//두 개의 정수를 전달한 후 + 연산
		System.out.println(args[0] + args[1]);
		System.out.println("----------");
		
		//String -> int 변환
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("합계 : " + (num + num2));
	}
}
