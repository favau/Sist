package kr.s03.method;

public class MethodMain02 {
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1을, 0이면 0을
	 * 양수이면 1을 반환하는 signOf 메서드를 작성하시오.
	 */
	public int signOf(int a) {
		if(a>0) {
			return 1;
		}else if(a<0) {
			return -1;
		}else {
			return 0;
		}
	}
	public static void main(String[] str) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		MethodMain02 mt = new MethodMain02();
		int test = mt.signOf(sc.nextInt());
		System.out.println(test);
		sc.close();
	}
}
