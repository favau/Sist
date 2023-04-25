package kr.s03.operation;
//switch문
public class SwitchMain02 {
	public static void main(String[] args) {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("===Switch문===");
	
	System.out.print("계절 입력>");
	//next() : 봄 여름 -> 봄 만 반환
	//nextLine() : 봄 여름 -> 봄 여름 한 라인 반환
	String season = sc.nextLine();
	
	switch(season) {
	case "봄":
		System.out.print("꽃이 피는 계절");
		break;
	case "여름":
		System.out.print("뜨거운 태양의 계절");
		break;
	case "가을":
		System.out.print("산들바람이 부는 계절");
		break;
	case "겨울":
		System.out.println("눈이 내리는 계절");
		break;
	default:
			System.out.println("없는 계절");
		}
	sc.close();
	}
}
