package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	public void showInfo() {
		System.out.println("---- 정보 ----");
		System.out.println("번호:"+this.num);
		System.out.println("이름:"+this.name);
		System.out.println("주소:"+this.addr);
		System.out.println("-------------");
	}
}
