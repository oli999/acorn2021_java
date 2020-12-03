package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//키보드로 부터 입력 받을수 있는 객체의 참조값을 kbd 라는 이름의 지역 변수에 담기
		InputStream kbd=System.in;
		InputStreamReader isr=new InputStreamReader(kbd);
		
		try {
			System.out.print("1글자 입력(한글가능):");
			int code=isr.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
