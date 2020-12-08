package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.member.dto.MemberDto;

/*
 *  Scanner 객체를 이용해서 검색할 회원의 번호를 입력 받아서
 *  입력받은 숫자를 이용해서 SELECT 문을 수행하고 
 *  결과값을 MemberDto 객체를 생성해서 담아 보세요.
 *  
 *  결과가 없다면 MemberDto 객체를 생성하지 마세요 ( null 인 상태로 두기 )
 */
public class MainClass07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 번호 입력:");
		int num=scan.nextInt();
		
		//검색된 회원 정보가 담길 MemberDto 객체의 참조값을 담을 지역변수
		MemberDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	}
}	





