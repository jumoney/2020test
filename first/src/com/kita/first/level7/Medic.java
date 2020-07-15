package com.kita.first.level7;

public class Medic extends Unit{

	public Medic() {
		super("메딕", 70);
	}
	
	public void heal(Unit unit) {
		if (this == unit || !(unit instanceof Carable)) {
			System.err.println("치료할 수 없습니다.");
			return;
		}
		else {
			System.out.println("히이이일~");
			unit.setCurrent_hp(unit.MAX_HP);
			
		}
		
	}
	

}
