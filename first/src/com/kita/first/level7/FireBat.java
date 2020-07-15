package com.kita.first.level7;

public class FireBat extends Unit implements AttackUnit{

	private int damage;
	
	public FireBat() {
		super("파이어벳", 60);
		damage = 7;
	}

	@Override
	public void attack(Unit u) {
		if (this == u) {
			return;
		}
		System.out.println("퐈이어~~~");
		u.getDamage(damage);
		
	}
	
	@Override
	public String toString() {
		return String.format("%s, 현재HP : %,d", this.NAME, this.getCurrent_hp());
	}

}
