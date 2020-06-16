package com.kita.first;

public class PrintF {
	public static void main(String[] agrs) {
		int age= 28;
		String name = "사공수기";
		float vision = 0.5f;
		char bloodType = 'B';
		
		System.out.printf("나의 이름은 %s 나의 나이는 %d 나의 시력은 %.2f 나의 혈액형은 %c \n", 
				name, age, vision, bloodType);
		
		
	}
}
