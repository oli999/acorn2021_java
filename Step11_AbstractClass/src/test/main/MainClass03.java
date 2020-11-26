package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	// Inner Class (내부 클래스에 한해서 필요하다면 static 예약어를 붙일수 있다) 
	static class AirPlane extends Weapon{
		@Override
		public void attack() {
			System.out.println("공중에서 공격을 해요");
		}
	}
	
	public static void main(String[] args) {
		//Local Inner Class 
		class Sword extends Weapon{
			@Override
			public void attack() {
				System.out.println("칼로 공격을 해요!");
			}
		}
		Weapon w1=new Sword();
		useWeapon(w1);
		
		Weapon w2=new AirPlane();
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
