package kr.s08.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.util.DBUtil;

//SELECT -> executeQuery
//others -> executeUpdate
public class BookDAO {
	//도서 등록 INSERT문 이용
	public void addBook(String bk_name,String bk_category) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO book (bk_num,bk_name,bk_category,bk_regdate)"
					+" VALUES (book_seq.nextval,?,?,SYSDATE)";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);

			//?에 데이터 바인딩
			pstmt.setString(1,bk_name);
			pstmt.setString(2,bk_category);
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//도서 목록 보기
	public void showBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM book ORDER BY bk_num ASC";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩 필요 X
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			//sql에 있는 도서 목록을 java에서 출력
			System.out.println("----------------------------------------");
			System.out.println("도서번호\t제목\t카테고리\t등록일");
			while(rs.next()) {
				System.out.print(rs.getInt("bk_num")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				System.out.print(rs.getString("bk_category")+"\t");
				System.out.println(rs.getString("bk_regdate")+"\t");
			}
			System.out.println("----------------------------------------");
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//도서 수정 필수x
	//도서 삭제 필수x
	
	//아이디 중복 체크
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_id FROM member me_id=?";
			//JDBC 수행3단계 PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,me_id);
			//JDBC 수행4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return count; //아이디 중복 : 1, 아이디 미중복 : 0
	}
	//회원 가입 1.아이디 중복 확인
	public void NewRegisterIdCheck(String me_id,String me_passwd,String me_name,String me_phone) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			sql = "SELECT count(me_id) FROM member WHERE me_id IN ?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,me_id);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();
			rs.next();
			//입력받은 me_id가 db에 있는 me_id와 동일하면(me_id IN me_id) 그 count를 출력하여 if문
			if(rs.getInt("count(me_id)")>=1) { //기존 아이디와 겹치면 가입x
				System.out.println(" 이미 존재하는 아이디입니다.");
			}else{//기존 아이디와 겹치지 않으면 가입o
				//NewRegister 메서드 호출(SQL에 회원가입 정보 INSERT)
				NewRegister(me_id,me_passwd,me_name,me_phone);
				System.out.println("회원가입 완료.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//회원 가입 2.아이디 중복 X
	public void NewRegister(String me_id, String me_passwd,String me_name,String me_phone){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			sql = "INSERT INTO member (me_num,me_id,me_passwd,me_name,me_phone,me_regdate) "
					+ "VALUES (member_seq.nextval,?,?,?,?,SYSDATE)";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,me_id);
			pstmt.setString(2,me_passwd);
			pstmt.setString(3,me_name);
			pstmt.setString(4,me_phone);
			//JDBC 수행4단계 : SQL문장 실행
			pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//로그인 체크
	public int loginCheck(String me_id,String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int me_num = 0; //회원 번호
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			sql = "SELECT me_num FROM member WHERE me_id=? AND me_passwd=?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,me_id);
			pstmt.setString(2,me_passwd);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				me_num = rs.getInt("me_num");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return me_num;
	}
	//회원 목록 보기
	public void MemberList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM member ORDER BY me_num ASC";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();
			System.out.println("회원번호\t아이디\t비밀번호\t이름\t전화번호\t가입일");
			while(rs.next()) {
			System.out.print(rs.getInt("me_num")+"\t");
			System.out.print(rs.getString("me_id")+"\t");
			System.out.print(rs.getString("me_passwd")+"\t");
			System.out.print(rs.getString("me_name")+"\t");
			System.out.print(rs.getString("me_phone")+"\t");
			System.out.println(rs.getString("me_regdate"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//도서 대출 여부 확인
	public void CheckBook(int bk_num,int me_num){ //2번째
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//책 번호가 ?인 책의 대출상태 출력
			sql = "SELECT re_status FROM reservation WHERE bk_num = ? AND re_status = 1";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1,bk_num);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();

			if(rs.next()) { //대출하려는 책이 대출중인지 확인
				//대출중이라면
				System.out.println("이미 대출중인 책입니다.");
			}else {
				//대출중이 아니라면 
				//CheckOutBook 메서드 호출하여 대출 진행

				CheckOutBook(bk_num,me_num);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//대출할 도서가 존재하는지 확인
	//메소드 오버로딩
	public int CheckBook(int bk_num) { //1번째
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int a = 0;
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//책 번호가 ?인 책의 대출상태 출력
			sql = "SELECT COUNT(bk_num) FROM book WHERE bk_num = ?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1,bk_num);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();
			rs.next();
		    a = rs.getInt("COUNT(bk_num)");
		    // BookUserMain에서 출력
		    //System.out.println("존재하지 않는 책입니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return a;
	}
	
	//도서 대출
	public void CheckOutBook(int bk_num,int me_num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			sql = "INSERT INTO reservation (re_num,re_status,bk_num,me_num,re_regdate,re_modifydate)"
					+"VALUES (reservation_seq.nextval,1,?,?,SYSDATE,NULL)";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1,bk_num);
			pstmt.setInt(2,me_num);
			//JDBC 수행4단계 : SQL문장 실행
			rs = pstmt.executeQuery();
			System.out.println("대출이 완료되었습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);

		}
		return;
	}
	//대출 목록 보기(관리자)
	public void CheckOut() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			//book 테이블의 re_status(대출여부)가 1(대출중)인 도서의
			//bk_num(도서번호)와 reservation 테이블의 bk_num을 inner join 하여
			//bk_num, bk_name, bk_category, bk_regdate와 함께 출력
			//SELECT bk.bk_num, bk.bk_name, bk.bk_category, bk.bk_regdate, re.me_num, re.re_regdate, re.re_num
			//From book bk Inner Join reservation re ON bk.bk_num = re.bk_num
			//WHERE re_status IN '1';
			sql = "SELECT bk.bk_num, bk.bk_name, bk.bk_category, bk.bk_regdate, re.me_num, re.re_regdate, re.re_num "
					+ "From book bk Inner Join reservation re ON bk.bk_num = re.bk_num "
					+ "WHERE re_status IN '1'";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			//sql에 있는 대출된 도서의 목록을 java에서 출력
			if(rs.next()) {
				System.out.println("도서 번호\t책 제목\t책 카테고리\t책등록일\t\t회원 번호\t대출 날짜\t\t     예약 번호");
				System.out.print(rs.getInt("bk_num")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				System.out.print(rs.getString("bk_category")+"\t");
				System.out.print(rs.getString("bk_regdate")+"\t");
				System.out.print(rs.getInt("me_num")+"\t");
				System.out.print(rs.getString("re_regdate")+"\t");
				System.out.println(rs.getInt("re_num")+"\t");
				while(rs.next()) {
					//도서 번호 bk.bk_num
					System.out.print(rs.getInt("bk_num")+"\t");
					//책 제목 bk.bk_name
					System.out.print(rs.getString("bk_name")+"\t");
					//책 카테고리 bk.bk_category
					System.out.print(rs.getString("bk_category")+"\t");
					//책 등록일 bk.bk_regdate
					System.out.print(rs.getString("bk_regdate")+"\t");
					//대출한 회원 번호 re.me_num
					System.out.print(rs.getInt("me_num")+"\t");
					//예약(대출) 날짜 re.re_regdate
					System.out.print(rs.getString("re_regdate")+"\t");
					//예약 번호 re.re_num
					System.out.println(rs.getInt("re_num")+"\t");
				}
			}else {
					System.out.println("대출중인 도서가 없습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//MY 대출 목록 보기
	public void MyCheckOut(int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT bk.bk_num,bk.bk_name,bk.bk_category,re.re_regdate "
					+ "FROM book bk INNER JOIN reservation re ON bk.bk_num = re.bk_num "
					+ "WHERE re.me_num IN ? AND re.re_status IN 1";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,me_num);
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			//sql에 있는 대출된 도서의 목록을 java에서 출력
			if(rs.next()) {
				System.out.println("나의 대출 도서 목록");
				System.out.println("도서번호\t책제목\t책카테고리\t대출날짜");
				System.out.print(rs.getInt("bk_num")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				System.out.print(rs.getString("bk_category")+"\t");
				System.out.println(rs.getString("re_regdate")+"\t");
				while(rs.next()) {
					System.out.print(rs.getInt("bk_num")+"\t");
					System.out.print(rs.getString("bk_name")+"\t");
					System.out.print(rs.getString("bk_category")+"\t");
					System.out.println(rs.getString("re_regdate")+"\t");
				}
			}else {
				System.out.println("대출중인 도서가 없습니다.");
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//반납 가능 여부 (반납하고자 하는 책 번호와 회원번호 입력받아 대출중인지 확인)
	public void CanCheckOut(int me_num,int bk_num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT bk_num FROM reservation \r\n"
					+ "WHERE me_num = ? AND bk_num = ? AND re_status IN 1";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,me_num);
			pstmt.setInt(2,bk_num);
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			//re_status 0 or 1 / 미대출 or 대출중 
			while(rs.next()) {
				if(rs.getInt("bk_num")==bk_num) {//반납이 가능하다면 CheckOut 메서드 호출하여 반납 진행
					CheckOutDone(me_num,bk_num);
					return;
				}else {//대출중이 아니라면
					System.out.println("대출중인 책이 아닙니다.");
				}
			}
			System.out.println("대출중인 책이 아닙니다.");
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
	//반납 처리 로그 변경
	public void CheckOutDone(int me_num,int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE reservation SET re_status =0,re_modifydate=SYSDATE WHERE bk_num IN ?";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,bk_num);
			//JDBC 수행4단계
			pstmt.executeUpdate();
			System.out.println("반납 처리 완료");
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			DBUtil.executeClose(rs,pstmt,conn);
		}
		return;
	}
}