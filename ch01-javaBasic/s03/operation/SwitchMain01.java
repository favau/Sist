package kr.s03.operation;
//switch문
public class SwitchMain01 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("===switch문===");
		System.out.print("정수 입력>");
		int a = sc.nextInt();
		//switch의 인자값은 long을 제외한 정수형
		//byte, short, int, char 문자열 사용 가능
		switch(a) {
	case 1:
		System.out.println("1 입력");
		break;
	case 2:
		System.out.println("2 입력");
		break;
	case 3:
		System.out.println("3 입력");
		break;
	default:
		System.out.println("1,2,3이 아닌 숫자 입력");
		}
		sc.close();
	}
}
