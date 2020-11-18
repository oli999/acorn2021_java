package test.main;
/*
 *  2. 증감 연산자 테스트
 *  변수에 있는 숫자값을 1씩 증가 혹은 1씩 감소 시킬때 사용한다.
 *  ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++; //num 이 최종적으로 3이 된다.
		
		int num2=0;
		num2--;
		num2--;
		num2--; //num 이 최종적으로 -3이 된다.
		
		int num3=0;
		int result1=++num3; // result1 은 1 num3 는 1
		
		int num4=0;
		//변수 뒤에 있는 증감 연산자는 연산의 우선순위가 가장 늦다 (대입연산자 보다도 늦다)
		int result2=num4++; // result2 와 num4 값을 확인해 보세요.
		
		//num, num2 에 있는 값을 0으로 수정하고 다시 테스트
		num=0;
		num2=0;
		
		int result3= num-- + ++num2; 
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}








