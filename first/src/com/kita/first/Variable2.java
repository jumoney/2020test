package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num3 = 20;
		int num4 = 10, num5 = 20;
		
		System.out.println(num3);
		
		//변수명 주의사항!
		//1. 소문자 시작!! (가능한 카멜 케이스 기법 사용) int myMaxHeight;
		//2. 특수기호는_(언더바), $(달러)만 사용가능 - 특수기호로 시작해도 무방!
		//3. 숫자로 시작NoNo해!!, 뒤에 붙이는건Ok! e.g) int 12a (x); , int top10; int top10good (o)
		//4. 예약어(보라색) 사용 금지! e.g) int char;
		//5. 변수명을 띄우시면NoNo해! e.g) int aa aa;
		//6. 대소문자를 가린다. e.g) int aa, aA, Aa, AA;
		//자바의 정석 1권 20p 참고.
		
		final int MY_MAX_HIGHT = 1000;
		
		//7. 상수명은 무조건 대문자 구분은 언더바로 한다.
	}
}
