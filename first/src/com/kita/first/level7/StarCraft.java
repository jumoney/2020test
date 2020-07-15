package com.kita.first.level7;

public class StarCraft {
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		
		
		//마린, 전체HP : 50
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println("m1: " + m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println("fb: " + fb);
		
		medic.heal(m1);
		System.out.println(m1);
		medic.heal(fb);
		System.out.println(fb);

	}

}
