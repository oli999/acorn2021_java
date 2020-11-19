package test.mypac;
/*
 *  [ 클래스의 용도 ]
 *  
 *  1. 객체의 설계도 역활 
 *     - 객체는 값의 저장소(Field) 와 기능(Method)으로 이루어져 있다.
 *     - 객체의 설계도 역활이라는 의미는 해당 클래스로 객체를 생성 했을때
 *       그 객체가 어떤 저장소와 어떤 기능을 갖게 할지 정할수 있다라는 의미이다. 
 *  2. Data Type 의 역활
 *  3. static 자원들을 감싸고 있는 역활
 */
public class Car {
	//필드(저장소) 정의하기 
	public String name;
	public int cc;
	
	//달리는 메소드(기능)
	public void drive() {
		System.out.println("달려요!");
	}
	//엉덩이를 따듯하게 하는 기능
	public void hotHip() {
		System.out.println("엉뎅이를 따듯하게 해요");
	}
	
}









