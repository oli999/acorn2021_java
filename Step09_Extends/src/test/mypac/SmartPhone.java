package test.mypac;

public class SmartPhone extends HandPhone{
	//인터냇 하는 메소드
	public void doInternet() {
		System.out.println("인터냇을 해요");
	}
	//이 메소드는 재정의한 메소드라고 표시해주는 어노테이션(@)
	//특별한 기능을 하는것은 아니고 단지 재정의한 메소드라로 표시해주는 기능만 있다. 
	@Override
	public void takePicture() {
		// super 는 부모 객체를 가리키는 예약어이다.
		// 피 오버라이드된 부모 메소드도 만일 호출하려면
		// 아래와 같이 호출하면된다.
		// super.takePicture();
		// 부모메소드를 호출해야 하는지 아닌지는 그때 그때 클래스에 따라 다르므로
		// 클래스 사용법을 학습을 해서 선택을 해야 한다. 
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
}





