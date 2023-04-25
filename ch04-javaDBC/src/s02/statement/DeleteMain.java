package kr.s02.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMain {
	public static void main(String[] args) {
		
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_password = "1234";
	
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
	
		try {
			//JDBC 수행1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행2단계 : Connection 객체 생성, 오라클 접속
			conn = DriverManager.getConnection(db_url,db_id,db_password);
		
			//SQL문 작성
			sql = "DELETE FROM test1 WHERE id='star'";
		
			//JDBC 수행3단계 : Statement 객체 생성
			stmt = conn.createStatement();
		
			//JDBC 수행4단계 : SQL문 실행
			//행을 삭제한 후 삭제한 행의 개수 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(stmt!=null)try{stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
	}
}
