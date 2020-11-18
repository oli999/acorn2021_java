package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		//int type 변수 선언과 동시에 값 대입하기
		int num1=10;
		//int type 변수 선언만 하고  (지역 변수는 선언만하면 만들어 지지 않는다)
		int num2;
		//값은 나중에 대입하기(값이 대입되는 시점에 변수가 만들어 진다)
		num2=20;
		
		/*
		 *  정수의 표현 가능한 범위 순서
		 *  byte < short < int < long
		 */
		int myInt=100;
		byte myByte=100;
		// int type 변수에 있는 값을 int type  변수에 대입 
		int a=myInt;
		// byte type 변수에 있는 값을 int type  변수에 대입
		int b=myByte;
		// int type  변수에 있는 값을 byte type 변수에 대입 (문법 오류)
		//byte c=myInt;
		
		/*
		 *  표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입하려면 
		 *  프로그래머가 대입을 해도 문제가 없다는 것을 확인하고
		 *  명시적으로 casting 하면 대입이 가능하다 
		 *  (  myInt 안에 있는 숫자는 byte 범위를 절대 넘어가지 않아 ! )
		 */
		byte c=(byte)myInt;  //강제 casting 을 하면 대입 가능 
		//100 이 저장되어 있는 변수에 200 을 대입하고 
		myInt=200;
		//강제 casting 해서 대입 한다면? 
		byte d=(byte)myInt;  //원래 값과 다른 값이 대입된다 (-56)
	}
}














