package kr.s07.score;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	//BufferedReader, dao클래스 선언
	
	public ScoreMain() {
		try {
			dao = new ScoreDAO(); //ScoreDAO(주요기능) 클래스 선언
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu(); //callMenu메서드 호출
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu()throws IOException{
		System.out.println("1.입력,2.목록,3.상세정보,4.수정,5.삭제,6.종료");
		try {
			int no = Integer.parseInt(br.readLine());
			if(no==1) { //입력
				System.out.print("이름:");
				String name = br.readLine();
				System.out.print("국어:");
				int korean = Integer.parseInt(br.readLine());
				System.out.print("영어:");
				int english = Integer.parseInt(br.readLine());
				System.out.print("수학:");
				int math = Integer.parseInt(br.readLine());
				
				int sum = makeSum(korean,english,math);
				int avg = makeAvg(sum);
				String grade = makeGrade(avg);
				
				//ScoreDAO의 insertInfo에 입력받은 데이터 전달
				dao.insertInfo(name,korean,english,math,sum,avg,grade);
			}else if(no==2) { //목록
				dao.selectInfo();
			}else if(no==3) { //상세정보
				System.out.println("상세정보");
				int num = Integer.parseInt(br.readLine());
				dao.selectDetailInfo(num);
			}else if(no==4) { //수정
				//목록
				dao.selectInfo();
				
				System.out.print("수정할 성적 번호:");
				int num = Integer.parseInt(br.readLine());
				System.out.println("이름:");
				String name = br.readLine();
				System.out.println("국어:");
				int korean = Integer.parseInt(br.readLine());
				System.out.print("영어:");
				int english = Integer.parseInt(br.readLine());
				System.out.print("수학:");
				int math = Integer.parseInt(br.readLine());
				int sum = makeSum(korean,english,math);
				int avg = makeAvg(sum);
				String grade = makeGrade(avg);
				dao.updateInfo(num,name,korean,english,math,sum,avg,grade);
			}else if(no==5) { //삭제
				//ahrfhr
				dao.selectInfo();
				
				System.out.println("삭제할 성적 번호");
				int num = Integer.parseInt(br.readLine());
				dao.deleteInfo(num);
			}else if(no==6) { //종료
				
			}else { //no가 1~6 이외의 입력
				System.out.println("잘못 입력 했습니다.");
			}
				
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력 가능!!");
		}
	}
	//총점 구하기
	public int makeSum(int korean,int english,int math) {
		return korean+english+math;
	}
	//평균 구하기
	public int makeAvg(int sum) {
		return sum/3;
	}
	//등급 구하기
	public String makeGrade(int avg) {
		String grade;
		switch(avg/10) {
		case 10:
		case 9: grade="A";break;
		case 8: grade="B";break;
		case 7: grade="C";break;
		case 6: grade="D";break;
		default: grade="F";
		}
		return grade;
	}
	//성적 범위 체크(0~100)
	public int parseInputData(String course)throws IOException{
		while(true) {
			System.out.println(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num>100)
					throw new ScoreValueException("0부터 100사이의 값만 인정!!");
				
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요!!");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	//Main
	public static void main(String[] args) {
		new ScoreMain();
	}
}
