package kr.s11.array;

public class Score {
	/*
	 * [실습]
	 * 멤버변수 : 이름(name), 국어(korean), 영어(english), 수학(math)
	 * 멤버메서드 : get/set메서드 정의, 총점(makeSum())
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 * 평균(makeAvg()), 등급(makeGrade()) 
	 */
	private String name;
	private int korean;
	private int english;
	private int math;
	private int avg=0,sum=0;
	
	public Score() {}
	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int makeSum(int a,int b,int c) {
		sum = a+b+c;
		return sum;
	}
	public int makeAvg(int a) {
		avg = a/3;
		return avg;
	}
	
	
}
