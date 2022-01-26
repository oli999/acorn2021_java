package test.dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dept.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	//부서정보를 추가하는 메소드(insert)
	public boolean insert(DeptDto dto) {
		//필요한 값을 담을 지역 변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			//Connection 객체의 참조값
			conn = new DBConnect().getConn();
			//실행할 sql 문
			String sql = "INSERT INTO dept"
					+ " (deptno, dname, loc)"
					+ " VALUES(dept_seq.NEXTVAL, ?, ?)";
			//PreparedStatement 객체의 참조값
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기 
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			//sql 문 실행하기 
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//작업의 성공 여부를 리턴해 준다.
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}
	//부서정보를 수정하는 메소드(update)
	public boolean update(DeptDto dto) {
		//필요한 값을 담을 지역 변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			//Connection 객체의 참조값
			conn = new DBConnect().getConn();
			//실행할 sql 문
			String sql = "UPDATE dept"
					+ " SET dname=?, loc=?"
					+ " WHERE deptno=?";
			//PreparedStatement 객체의 참조값
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기 
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
			//sql 문 실행하기 
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//작업의 성공 여부를 리턴해 준다.
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}
	//부서정보를 삭제하는 메소드(delete)
	public boolean delete(int deptno) {
		//필요한 값을 담을 지역 변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			//Connection 객체의 참조값
			conn = new DBConnect().getConn();
			//실행할 sql 문
			String sql = "DELETE FROM dept"
					+ " WHERE deptno=?";
			//PreparedStatement 객체의 참조값
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기 
			pstmt.setInt(1, deptno);
			//sql 문 실행하기 
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//작업의 성공 여부를 리턴해 준다.
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}
	//부서 하나의 정보를 리턴하는 메소드 (select)
	public DeptDto select(int deptno) {
		//리턴해줄 객체를 담을 지역변수 만들기
		DeptDto dto=null;
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			//실행할 select 문 작성
			String sql="SELECT dname, loc"
					+ " FROM dept"
					+ " WHERE deptno=?";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩 하기
			pstmt.setInt(1, deptno);
			//select 문 실행하고 결과를 ResultSet 으로 받아오기
			rs=pstmt.executeQuery();
			//ResultSet 에서 cursor 를 내리면서 값 추출하기
			while(rs.next()) {
				dto=new DeptDto();
				dto.setDeptno(deptno);
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
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
			
		return dto;
	}
	//부서의 목록을 리턴하는 메소드 (selectAll)
	public List<DeptDto> selectAll(){
		//부서 목록을 담을 ArrayList 객체를 생성해서 참조값을 지역변수에 담아 놓는다.
		List<DeptDto> list=new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			//실행할 select 문 작성
			String sql = "SELECT deptno, dname, loc"
					+ " FROM dept"
					+ " ORDER BY deptno ASC";
			pstmt = conn.prepareStatement(sql);
			//? 에 값 바인딩 하기

			//select 문 실행하고 결과를 ResultSet 으로 받아오기
			rs = pstmt.executeQuery();
			//ResultSet 에서 cursor 를 내리면서 값 추출하기
			while (rs.next()) {
				//select 된 row 하나의 정보를 DeptDto 객체에 담아서 
				DeptDto dto=new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				//ArrayList 객체에 누적 시킨다.
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
}











