package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		/*  1. 각각의 점수를 지역변수 eng, kor, math 에 대입해 보세요.
		 *  영어점수 : 100
		 *  국어점수 : 100
		 *  수학점수 : 90 
		 */
		int eng=100;
		int kor=100;
		int math=90;
		// 2. eng, kor, math 세 점수의 합을 구해서 sum 이라는 이름의 지역 변수에 담아 보세요.
		int sum=eng+kor+math;
		// 3. eng, kor, math 의 평균값을 구해서 ave  라는 이름의 지역 변수에 담아 보세요.
		// int type  과 int type 을 연산하면 결과는 int type 만 나온다.
		// 만일 정확한 실수 값을 얻어내고 싶으면 연산에 참여하는 데이터 중에 
		// 어느 하나가 실수 type 이 되어야 실수 type 이 결과로 나온다. 
		double ave=(double)sum/3;
		// 4. ave 안에 들어 있는 값을 콘솔창에 출력 해 보세요.
		System.out.println(ave);
	}
}






