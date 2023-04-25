package kr.s02.operator;

public class OperatorMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		 * 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지 구하시오.
		 * 
		 */
		
		int pen = 534, student = 30;
		int each, other;
		each = pen / student;
		other = pen % student;
		
		System.out.println(each);
		System.out.print(other);
	}

}
