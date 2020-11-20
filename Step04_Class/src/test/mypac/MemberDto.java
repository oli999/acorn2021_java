package test.mypac;

public class MemberDto {
	public int num;
	public String name;
	public String addr;
	
	// 객체를 new 할때 호출되는 생성자
	// 메소드가 아님
	// 생성자(Constructor) 임
	// 생성자의 특징은 리턴 type (void) 가 없고 클래스명과 동일하게 작성해야 한다. 
	public MemberDto(int num,String name,String addr) {
		System.out.println("MemberDto() 생성자가 호출됨!");
		//생성자로 전달 받은 값을 필드에 저장하기
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}




