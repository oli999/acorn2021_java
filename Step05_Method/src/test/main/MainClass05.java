package test.main;

import test.mypac.House;
import test.mypac.MyObject;
import test.mypac.Phone;

public class MainClass05 {
	public static void main(String[] args) {
		//1. MyObject 클래스의 callPhone()  메소드를 호출해 보세요.
		MyObject.callPhone(new Phone());
		//2. MyObject  클래스의 buyHouse() 메소드를 호출하고 
		// 리턴되는 참조값을 myHome 이라는 이름의 지역 변수에 담아 보세요.
		House myHome=MyObject.buyHouse();
	}
}
