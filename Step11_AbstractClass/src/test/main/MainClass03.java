package test.main;

import test.mypac.Tank;
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
		//Sword 객체를 생성해서 참조값을 Weapon type 으로 받기
		Weapon w1=new Sword();
		useWeapon(w1);
		//AirPlane 객체를 생성해서 참조값을 Weapon type 으로 받기
		Weapon w2=new AirPlane();
		useWeapon(w2);
		//Tank 객체를 생성해서 참조값을 Weapon type 으로 받기
		Weapon w3=new Tank();
		useWeapon(w3);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
