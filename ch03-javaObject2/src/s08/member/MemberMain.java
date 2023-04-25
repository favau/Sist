package kr.s08.member;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MemberMain {
	/*
	 * [실습]
	 * ArrayList에 Member객체를 저장하는 방식으로 회원 정보를 관리
	 * 메뉴 : 1.회원정보입력, 2.회원정보출력, 3.종료
	 * 조건체크 : 회원정보를 입력 받을 때 나이는 1살이상 입력 가능
	 */
	ArrayList<Member> list;
	BufferedReader br;
	public void MemberMain() {
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			//예외문구를 콘솔에 출력
			e.printStackTrace();
		}finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}
	
	public void callMenu() throws IOException{
		while(true) {
			try {
				System.out.println("1.회원정보입력 2.회원정보출력 3.종료>");
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					Member m = new Member();
					System.out.println("이름");
					m.setName(br.readLine());
					System.out.println("나이");
					m.setAge(Integer.parseInt(br.readLine()));
					System.out.println("직업");
					m.setJob(br.readLine());
					System.out.println("주소");
					m.setAddress(br.readLine());
					System.out.println("전화번호");
					m.setPhone(br.readLine());
					list.add(m);
				}else if(num == 2) {
					//회원정보출력
					System.out.println("이름\t나이\t직업\t주소\t번호");
					for(Member m : list) {
						System.out.printf("%s\t",m.getName());
						System.out.printf("%d\t",m.getAge());
						System.out.printf("%s\t",m.getJob());
						System.out.printf("%s\t",m.getAddress());
						System.out.printf("%s\n",m.getPhone());
					}
				}else if(num == 3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("1부터 3 사이의 숫자만 입력");
				}
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력");
			}
		}
	}
	public static void main(String[] args) {
		new MemberMain();
	}
}
