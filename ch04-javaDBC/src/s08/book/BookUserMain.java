package kr.s08.book;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//어드민은 adminMain 사용
public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private int me_num; //회원 번호
	private boolean flag; //로그인 여부(로그인 true,비로그인 false)
	
	public BookUserMain() {
		try {
			dao = new BookDAO(); //핵심 기능 가진 클래스 선언
			br = new BufferedReader(new InputStreamReader(System.in)); //입력 객체 선언
			callMenu(); //메뉴 출력 
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	//메뉴 출력 메서드
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.로그인,2.회원가입,3.종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) { //로그인
					System.out.print("아이디:");
					String me_id = br.readLine();
					
					System.out.println("비밀번호:");
					String me_passwd = br.readLine();
					
					me_num = dao.loginCheck(me_id, me_passwd);
					if(me_num>0) {
						System.out.println(me_id + "님 로그인 되었습니다.");
						flag = true;
						break;
					}
					System.out.println("아이디 또는 비밀번호 불일치");
				}else if(no==2) { //회원가입
					System.out.println("회원가입");
					
					System.out.print("아이디:");
					String me_id = br.readLine();
					System.out.print("비밀번호:");
					String me_passwd = br.readLine();
					System.out.print("이름:");
					String me_name = br.readLine();
					System.out.print("전화번호:");
					String me_phone = br.readLine();
					
					dao.NewRegisterIdCheck(me_id,me_passwd,me_name,me_phone);

				}else if(no==3) { //종료
					System.out.println("프로그램 종료");
					break;
				}else{ //잘못된 입력
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력 가능!!");
			}
		} //end of while
		
		//로그인했을 때 메뉴
		while(flag) {
			System.out.println("1.도서대출,2.MY대출목록,3.대출도서 반납,4.종료 > ");
			try {
				int no=Integer.parseInt(br.readLine());
				if(no==1) {//도서 대출
					//도서 목록
					dao.showBook();
					System.out.print("대출할 도서의 도서번호 입력:");
					int bk_num = Integer.parseInt(br.readLine());
					if(dao.CheckBook(bk_num)!=0) {
						dao.CheckBook(bk_num,me_num);
					}else {
						System.out.println("존재하지 않는 도서입니다.");
					}
				}else if(no==2) {//MY대출 목록
					dao.MyCheckOut(me_num);
				}else if(no==3) {//대출도서 반납
					System.out.println("반납하고자 하는 도서의 도서번호 입력:");
					int bk_num = Integer.parseInt(br.readLine());
					dao.CanCheckOut(me_num,bk_num);
				}else if(no==4) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	} //end of callMenu
	
	public static void main(String[] args) {
		System.out.println("User 계정으로 접속");
		new BookUserMain();
	}
}
