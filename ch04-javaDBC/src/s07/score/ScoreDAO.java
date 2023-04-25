package kr.s07.score;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;
public class ScoreDAO {
	//성적입력
	public void insertInfo(String name,
							int korean,
							int english,
							int math,
							int sum,
							int avg,
							String grade) {
		Connection conn = null; //java와 db 연결하는 객체 선언
		PreparedStatement pstmt = null; //sql구문을 실행하는 역할 객체 선언
		String sql = null; //sql 명령어 변수 선언
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO score (num,name,korean,english,"
					+ "math,sum,avg,grade,reg_date)"
					+ "VALUES (score_seq.nextval,?,?,?,?,?,?,?,SYSDATE)";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,name);
			pstmt.setInt(2,korean);
			pstmt.setInt(3,english);
			pstmt.setInt(4,math);
			pstmt.setInt(5,sum);
			pstmt.setInt(6,avg);
			pstmt.setString(7,grade);
			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null,pstmt,conn);
		}
	}
							
	//목록보기
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM score ORDER BY num DESC";
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			//번호,이름,국어,영어,수학,총점,평균,등급
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
			while(rs.next()) {
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("korean") + "\t");
				System.out.print(rs.getInt("english") + "\t");
				System.out.print(rs.getInt("math") + "\t");
				System.out.print(rs.getInt("sum") + "\t");
				System.out.print(rs.getInt("avg") + "\t");
				System.out.println(rs.getString("grade") + "\t");
				System.out.println("--------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//성적상세정보
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM score WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1,num);
			//JDBC 수행 4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.print("글번호:" + rs.getInt("num"));
				System.out.print(" 이름:" + rs.getString("name"));
				System.out.print(" 국어:" + rs.getInt("korean"));
				System.out.print(" 영어:" + rs.getInt("english"));
				System.out.print(" 수학:" + rs.getInt("math"));
				System.out.print(" 총점:" + rs.getInt("sum"));
				System.out.print(" 평균:" + rs.getInt("avg"));
				System.out.print(" 등급:" + rs.getString("grade"));
				System.out.print(" 작성일:" + rs.getDate("reg_date"));
			}else {
				System.out.println("검색된 행이 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs,pstmt,conn);
		}
	}
	//성적수정
	public void updateInfo(int num,String name,int korean,int english, int math,
			int sum, int avg, String grade) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE score SET name=?,"
					+ "korean=?,english=?,math=?,"
					+"sum=?,avg=?,grade=? WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,name);
			pstmt.setInt(2,korean);
			pstmt.setInt(3,english);
			pstmt.setInt(4,math);
			pstmt.setInt(5,sum);
			pstmt.setInt(6,avg);
			pstmt.setString(7,grade);
			pstmt.setInt(8,num);
			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs,pstmt,conn);
		}
	}
	//성적삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM score WHERE num=?";
			//JDBC 수행3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1,num);
			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs,pstmt,conn);
		}
	}
}
