package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 *  member 테이블에서 
 * 
 *  num 이 804 번인 회원의 
 *  
 *  addr 을 노량진으로 수정하는 코드를 작성해 보세요.
 *   
 */
public class MainClass04 {
	public static void main(String[] args) {
		int num=804;
		String addr="노량진";
		//DB 연결 객체를 담을 지역변수
		Connection conn=null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 정보
			String url="jdbc:oracle:thin:@14.63.164.99:1521:xe";
			//String url="jdbc:oracle:thin:@localhost:1521:xe";
			//접속하고 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "acorn01", "tiger01");
			//conn=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//sql 문을 대신 실행해주는 객체의 참조값을 담을 지역 변수 
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			//미완성의 update 문   
			String sql="UPDATE member "
					+ " SET addr=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			// ? 에 순서대로 값을 바인딩 하기
			// 바인딩 => binding => 연결하기 => 붙이기 => ??? 
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			//완성된 sql 문을 수행하고 변화된 row 의 갯수를 리턴 받는다.
			flag=pstmt.executeUpdate();
			System.out.println("회원 정보를 수정 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			System.out.println("작업(UPDATE) 성공");
		}else {
			System.out.println("작업(UPDATE) 실패");
		}		
	}
}	
