package com.kita.first.level4;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("동물", "포유류");
		Bird bird = new Bird("참새");
		Sparrow sparrow = new Sparrow();
		
		animal.crying();
		bird.crying();
		bird.flying();
		sparrow.whoAmI();
		
		
	}

}
