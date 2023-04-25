package kr.s19.lang;
//문자열 대소문자 변경
public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 아래 문자열의 소문자는 대문자로, 대문자는 소문자로 변경하시오.
		 */
		String str = "abcMDye-4W?EWzz";
		String result ="";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <=90) { // 대문자 -> 소문자
				result += String.valueOf(c).toLowerCase();
			}else if(c >=97 && c<=122){ // 소문자 -> 대문자
				result += String.valueOf(c).toUpperCase();
			}else // 그 외 문자들
				result += c;
		}
		System.out.println(result);
	}
}
