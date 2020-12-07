package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *   접속 ip 주소 : 14.63.164.99
 *   아이디 : acorn01
 *   비밀번호 : tiger01
 *   
 *   위의 DB 에 접속해서 
 *   emp 테이블의 내용중 에서 사원번호(empno), 사원이름(ename), 부서번호(deptno)
 *   를 select 해서 콘솔창에 출력해 보세요.
 *   단, 사원번호에 대해서 오름차순 정렬해서... 
 */
public class MainClass02 {
	public static void main(String[] args) {
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
		
		//Member 테이블의 내용을 select 해서 console  에 출력해보기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="SELECT empno,ename,deptno"
					+ " FROM emp"
					+ " ORDER BY empno ASC";
			//sql 문을 대신 실행해주는 PreparedStatement 객체의 참조값 얻어오기 
			pstmt=conn.prepareStatement(sql);
			//SELECT 문 수행하고 결과 row 를 ResultSet 객체로 받아오기 
			rs=pstmt.executeQuery();
			//rs.next() 메소드가 false  를 리턴할때 까지 while 반복문 돌기 
			while(rs.next()) {
				//현재 커서가 위치한 곳에서 empno 칼럼의 값을 정수로 얻어내기
				int empno=rs.getInt("empno");
				//현재 커서가 위치한 곳에서 ename 칼럼의 값을 문자로 얻어내기 
				String ename=rs.getString("ename");
				//현재 커서가 위치한 곳에서 deptno 칼럼의 값을 문자로 얻어내기 
				int deptno=rs.getInt("deptno");
				System.out.println(empno+"|"+ename+"|"+deptno);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		System.out.println("main 메소드가 종료 됩니다.");		
	}
}






