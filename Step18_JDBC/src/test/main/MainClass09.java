package test.main;

import test.member.dao.MemberDao;

public class MainClass09 {
	public static void main(String[] args) {
		// 850 번 회원의 정보를 삭제 하고자 한다.
		
		//이미 만들어진 클래스로 객체를 생성해서 
		MemberDao dao=new MemberDao();
		//메소드를 사용하는 사용자 입장이다.
		boolean isSuccess=dao.delete(851);
		//위 작업의 성공 여부를 알수가 없다
		//자~ 이제 여러분은 어떻게 할것인가?
		//위의 클래스는 여러분의 상사인 대리가 설계해서 만들었다고 가정하자
		// ??? 
		if(isSuccess) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패!");
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
