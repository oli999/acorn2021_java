package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//Car type 의 참조값을 담을수 있는 빈 지역 변수 car1 만들기 
		Car car1=null;
		//Car 클래스로 객체를 생성(new)하고 그 생성된 객체의 참조값을 car1 에  대입하기
		car1=new Car();
		
		//car1 지역 변수에 있는 참조값을 이용해서 메소드 호출하기 
		car1.drive();
		car1.hotHip();
	}
}




