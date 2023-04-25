package kr.s19.lang;
// indexOf - 앞에서부터 가장 먼저 나오는 문자(열)의 인덱스 출력
// lastIndexOf - 뒤에서부터 가장 먼저 나오는 문자(열)의 인덱스 출력
// substring - 전달된 인덱스부터 마지막 인덱스까지 문자열 출력
public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
              		 //012345678910, 길이 = 11;
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : " + index);
		
		index = s1.indexOf("Sun");
		System.out.println("문자열 Sun의 위치 : " + index);
		
		index = s1.lastIndexOf('n');
		System.out.println("마지막 문자 n의 위치 : " + index);
		
		char c = s1.charAt(index); //문자 추출
		System.out.println("추출한 문자 : " + c);
		
		index = s1.indexOf('S'); // idex = 5
		//전달된 인덱스부터 마지막 인덱스까지 문자열 출력
		String str = s1.substring(index); // 5 ~ 마지막 인덱스까지 문자열 출력
		System.out.println("대문자 S부터 끝까지 잘라내기 : " + str);
		
		//begin index부터 end index전까지 문자열 추출
		str = s1.substring(index, index + 3);
		System.out.println("대문자 S로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		//구분자를 이용해서 문자열을 잘라냄
		//" "띄어쓰기 를 기준으로 문자열을 배열 단위로 저장
		String[] array = s1.split(" ");
		for(int i=0; i<array.length;i++) {
			System.out.println("array[" + i + "]:" + array[i]);
		}
		//String s1 = null 객체 생성X;
		//String s2 = "" 객체 생성O;
	}
}
