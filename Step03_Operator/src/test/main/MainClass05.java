package test.main;
/*
 *  5. 대입 연산자
 *  
 *  - 우측에 있는 어떤값을 좌측에 대입하는 연산자
 *  
 *  =, +=, -=, *=, /=, %=
 */
public class MainClass05 {
	public static void main(String[] args) {
		//우측에 있는 값을 좌측에 그냥 대입
		int num=10;
		//우측에 있는 값을 원래 값에 더해서 대입
		// num=num+10;
		num+=10;
		//우측에 있는 값을 원래 값에 빼서 대입
		// num=num-10;
		num-=10;
		//우측에 있는 값을 원래 값에 곱해서 대입
		//num=num*4;
		num*=4;
		
		//우측에 있는 값을 원래 값에 나누어서 대입
		//num=num/5;
		num/=5;
		
		//우측에 있는 값으로 원래 값을 나눈 나머지값을 대입
		//num=num%6;
		num%=6;
	}
}








