package test.mypac;
/*
 *  아래와 같이 설계된 클래스를 Dto (Data Transfer Object) 라고 한다.
 *  
 *  [ 만드는 방법 ]
 *  1. 필드의 접근 지정자는 private 로 지정
 *  2. 기본생성자와, 필드에 모든값을 전달받는 생성자 2개가 있어야 한다.
 *  3. 필드의 접근 메소드 setter, getter 메소드가 형식에 맞게 정의 되어 있어야 한다.
 */
public class MemberDto {
	//필드의 접근 지정자를 private 로 하면 객체 내부에서만 접근 가능하고
	//외부에서는 접근 불가능하다 
	private int num;
	private String name;
	private String addr;
	
	//기본(default) 생성자를 명시적으로 정의하기
	//생성자는 얼마든지 다중 정의할수 있다. 
	//다중 정의를 overloading 이라고 한다 
	public MemberDto() {}
	
	// 객체를 new 할때 호출되는 생성자
	// 메소드가 아님
	// 생성자(Constructor) 임
	// 생성자의 특징은 리턴 type (void) 가 없고 클래스명과 동일하게 작성해야 한다.
	// 생성자를 하나라도 만들면 기본 생성자(default) 생성자는 없어진다. 
	public MemberDto(int num,String name,String addr) {
		System.out.println("MemberDto() 생성자가 호출됨!");
		//생성자로 전달 받은 값을 필드에 저장하기
		this.num=num;
		this.name=name;
		this.addr=addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}








