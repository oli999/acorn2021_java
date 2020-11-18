package test.main;
/* 
 *  [ Java 기본 데이터 type ]
 *  
 *  2. 논리형 (boolean)
 *  
 *  - true, false 두가지 값중 하나이다.
 *  - true, false  를 직접 쓰거나 비교 연산 혹은 논리 연산의 결과로 얻어 낼수 있다.
 *  - 참고 거짓을 나타내는 데이터 type  
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
		// 10>1 의 결과값을 isGreater 라는 이름의 지역 변수에 담아 보세요.
		boolean isGreate=10>1;
		// true || false 의 결과값을 result 라는 이름의 지역 변수에 담아 보세요.
		boolean result=true||false;
	}
}





