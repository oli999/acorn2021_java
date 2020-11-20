package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  test.mart 페키지 안에 있는 클래스를 활용해서...
		 *  
		 *  1. 게임을 한다.
		 *  2. oli999@naver.com 으로 이메일을 보낸다.
		 */
		
		Computer com1=new Computer(new Cpu(), new Memory(), new HardDisk());
		com1.playGame();
		com1.sendEmail("oli999@naver.com");
		
		Cpu cpu=new Cpu();
		Memory memory=new Memory();
		HardDisk hardDisk=new HardDisk();
		
		Computer com2=new Computer(cpu, memory, hardDisk);
		com2.playGame();
		com2.sendEmail("kbs-tv@daum.net");
	}
}












