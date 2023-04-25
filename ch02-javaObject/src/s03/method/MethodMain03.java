package kr.s03.method;

public class MethodMain03 {
	/*
	 * [실습]
	 * 배열 요소의 수를 입력받아서 배열 x 생성
	 * 입력받은 정수를 배열 x에 저장하고
	 * 배열 x가 가진 모든 요소의 합을 구하는
	 * sumOf(int[] a) 메서드를 정의하시오.
	 */
	int sum = 0;
	public int sumOf(int[] a) {
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int test;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		MethodMain03 mt = new MethodMain03();
		System.out.print("배열의 요소 수 입력");
		int y = sc.nextInt();
		int[] x = new int[y];
		for(int i = 0;i<y;i++) {
			System.out.print((i+1)+"번째 수 입력");
			x[i] = sc.nextInt();
		}
		System.out.println(mt.sumOf(x));
		sc.close();
	}
}
