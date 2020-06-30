package com.kita.first.level4;

public class Bird extends Animal{
	
	public Bird(String name) {
		super(name, "조류");
	}
	
	void flying() {
		System.out.println("훨~훨~");
	}
	
	@Override
	void crying() {
		System.out.println("짹짹!!");
	}

}
