package kr.s04.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 단을 입력 받아서 1~9까지 곱해서 값을 구하고
		 * 배열에 그 값을 저장한 후 배열에 저장된
		 * 값을 읽어서 구구단 출력 형식(2*1=2)으로 출력하시오
		 * 
		 * [입력 예시]
		 * 단 입력:2
		 * 
		 * [출력 예시]
		 * 2*1 = 2
		 * ..
		 * ..
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = sc.nextInt();
		int[] gob = new int[] {1,2,3,4,5,6,7,8,9};
		for(int i=1;i<gob.length+1;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*gob[i-1]);
		}
	sc.close();
	}
}
