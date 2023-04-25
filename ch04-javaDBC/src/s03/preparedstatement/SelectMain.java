package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM test2 ORDER BY num DESC";
			//JDBC수행 3단계 : prepareStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC수행 4단계 : SQL문을 실행해서 결과집합을 ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			System.out.println("번호\t제목\t\t작성자\t등록일");
			while(rs.next()) {
				System.out.print(rs.getInt("num") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getDate("reg_date"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs,pstmt,conn);
		}
	}

}
