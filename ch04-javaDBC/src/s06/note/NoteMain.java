package kr.s06.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NoteMain {
	
	private BufferedReader br;
	private NoteDAO note;
	
	public NoteMain() {
		try {
			note = new NoteDAO();
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
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
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.글쓰기,2.목록 보기,3.상세글 보기,4.글수정,5.글삭제,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//글쓰기
					System.out.println("이름:");
					String name = br.readLine();
					System.out.println("비밀번호:");
					String passwd = br.readLine();
					System.out.println("제목:");
					String subject = br.readLine();
					System.out.println("내용:");
					String content = br.readLine();
					System.out.println("이메일:");
					String email = br.readLine();
					
					//NoteDAO의 insertInfo()메서드 호출
					note.insertInfo(name,passwd,subject,content,email);
				}else if(no==2) {//목록 보기
					note.selectInfo();
				}else if(no==3) {//상세글 보기
					//목록 보기
					note.selectInfo();
					
					System.out.print("선택한 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					note.selectDetailInfo(num);
				}else if(no==4) {//글수정
					//목록 보기
					note.selectInfo();
					System.out.print("수정할 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					
					//글 상세 보기
					note.selectDetailInfo(num);
					System.out.println("----------");
					System.out.print("이름 : ");
					String name = br.readLine();
					System.out.print("비밀번호 : ");
					String passwd = br.readLine();
					System.out.print("제목 : ");
					String subject = br.readLine();
					System.out.print("내용 : ");
					String content = br.readLine();
					System.out.print("이메일 : ");
					String email = br.readLine();
					
				}else if(no==5) {//글삭제
					//목록 보기
					note.selectInfo();
					System.out.println("삭제할 글의 번호");
					int num = Integer.parseInt(br.readLine());
					
				}else if(no==6) {//종료
					System.out.println("프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	}	
	public static void main(String[] args) {
		NoteMain ex = new NoteMain();
	}
}

