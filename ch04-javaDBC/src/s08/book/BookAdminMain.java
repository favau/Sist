package kr.s08.book;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//어드민은 adminMain 사용
public class BookAdminMain {
	private BufferedReader br;
	private BookDAO dao;
	
	public BookAdminMain() {
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
			System.out.print("1.도서등록,2.도서목록,3.대출목록,4.회원목록,5.종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());
				
				if(no==1) { //도서등록
					System.out.println("등록할 도서의 정보를 입력합니다.");
					System.out.print("제목:");
					String bk_name = br.readLine();
					System.out.print("카테고리:");
					String bk_category = br.readLine();
					//addBook 메서드에 입력받은 도서 정보 데이터 입력
					dao.addBook(bk_name,bk_category);
					System.out.println("["+bk_name+"]" +" 도서 등록이 완료되었습니다.");
				}else if(no==2) { //도서목록
					dao.showBook();
				}else if(no==3) { //대출목록
					dao.CheckOut();
				}else if(no==4) { //회원목록
					dao.MemberList();
				}else if(no==5) { //종료
					System.out.println("프로그램 종료");
					break;
				}else{ //잘못된 입력
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e){
				System.out.println("숫자만 입력 가능!!");
			}finally {
				
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Admin 계정으로 접속");
		new BookAdminMain();
	}
}
