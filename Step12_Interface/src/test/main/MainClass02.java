package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//Remocon 인터페이스를 구현한 MyRemocon 클래스를 이용해서 객체를 생성하고
		//참조값을 Remocon type r1 이라는 지역변수에 담기 
		Remocon r1=new MyRemocon();
		//r1 에 있는 참조값을 전달하면서 useRemocon() 메소드 호출하기 
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
