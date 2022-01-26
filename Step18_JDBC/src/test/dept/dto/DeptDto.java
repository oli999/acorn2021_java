package test.dept.dto;

//부서 하나의 정보를 담을 dto 클래스 설계
public class DeptDto {
	//필드 
	private int deptno;
	private String dname;
	private String loc;
	
	//디폴트 생성자
	public DeptDto() {}

	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
