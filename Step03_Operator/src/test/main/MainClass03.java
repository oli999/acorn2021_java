package test.main;
/*
 *  3. 비교 연산자 테스트
 *   - 비교 연산의 결과는 boolean type  이다.
 *  ==, !=, >, >=, <, <= 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1=10==10;//true
		boolean result2=10!=10;//false
		boolean result3=10>100;//false
		boolean result4=10>=10;//true
		boolean result5=10<100;//true
		boolean result6=10<=10;//true
		
		// String type 변수에 null 대입하기 
		String name=null;
		
		//어떤 값이 null 인지 아닌지 비교 가능하다 
		boolean result7=name==null; //true
		boolean result8=name!=null; //false
	}
}








