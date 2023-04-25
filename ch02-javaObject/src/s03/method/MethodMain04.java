package kr.s03.method;

public class MethodMain04 {
	/*
	 * [실습]
	 * 배열 요소 수(사람 수)를 입력 받아서 배열 weight 생성.
	 * 입력 받은 정수를 배열 weight에 저장하고
	 * 배열 weight가 가진 모든 요소의 수 중에 최소값을 구하는
	 * minOf 메서드를 작성하시오
	 * 
	 * [출력 예시]
	 * 가장 마른 사람의 체중 : 24kng입니다.
	 */
	int min=0;
	public int minOf(int[] a) {
		min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		MethodMain04 mt = new MethodMain04();
		System.out.print("사람 수 입력 : ");
		int a = sc.nextInt();
		int[] weight = new int[a];
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+"번째 입력 : ");
			weight[i] = sc.nextInt(); 
		}
		System.out.print("가장 마른 사람의 체중 : "+mt.minOf(weight)+"kg입니다.");
		sc.close();
	}
}
