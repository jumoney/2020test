package com.kita.first.mission;

public class AnimalMission {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		
		doCry(dog);
		doCry(cat);
		doCry(spa);
			
	
	}
	
	public static void doCry(Animal ani) {
		ani.cry();
	}

}
