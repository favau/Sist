package kr.s03.operation;
//if응용
public class IfMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력받은 3개의 정수 중 최대값, 최소값을 구하시오. 
		 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("정수 입력 : ");
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				if(b>c) {
					System.out.printf("최대값 : %d 최소값 : %d",a,c);
				}else 
					System.out.printf("최대값 : %d 최소값 : %d",a,b);
			}else System.out.printf("최대값 : %d 최소값 : %d",c,b);
		}else {
			if(c>a) {
				if(b>c) {
					System.out.printf("최대값 : %d 최소값 : %d",b,a);
				}else {
					System.out.printf("최대값 : %d 최소값 : %d",c,a);
				}
			}else System.out.printf("최대값 : %d 최소값 : %d",b,c);
		}
		sc.close();
	}
}