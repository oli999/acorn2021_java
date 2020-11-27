package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	// Remocon 인터페이스를 구현한 Inner Class
	static class AirconRemocon implements Remocon{
		@Override
		public void up() {
			System.out.println("온도를 올려요");
		}
		@Override
		public void down() {
			System.out.println("온도를 내려요");
		}	
	}
	
	public static void main(String[] args) {
		//Remocon 인터페이스를 구현한 Local Inner Class
		class TvRemocon implements Remocon{
			@Override
			public void up() {
				System.out.println("체널을 올려요");
			}
			@Override
			public void down() {
				System.out.println("체널을 내려요");
			}
		}
		//Local Inner Class  를 이용해서 객체 생성
		Remocon r1=new TvRemocon();
		useRemocon(r1);
		//Inner Class 를 이용해서 객체 생성
		Remocon r2=new AirconRemocon();
		useRemocon(r2);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
