package kr.s01.basic;
//특수 문자 출력 방법
public class VariableTypeMain02 {
	public static void main(String[] args) {
		//확장 특수 출력 문자(escape sequence)
		char single = '\'';
		System.out.println(single);
		
		String str = "오늘은 \"목요일\" 입니다.";
		System.out.println(str);
		
		//문자열에 '를 표시하면 자동으로 일반문자로 변환
		String str2 = "오늘은 '부산'에 비가 와요";
		System.out.println(str2);
		
		//str3 = "C:\Program Files\Java\jdk-11.0.16.1";
		//System.out.println(str3);
		
		String str4 = "오늘은 목요일\n내일은 금요일";
		System.out.println(str4);
		
		String str5 = "이름\t나이\t취미";
		System.out.println(str5);
	}
}
