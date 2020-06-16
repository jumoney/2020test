package com.kita.first.mission;

public class Mission7_1 {
	/*
	 * while 문을 사용하여
	 * 1~100을 모두 더한 값이 출력되도록 하시오.
	 * 합계: 5050
	 */
	
	public static void main(String[] args) {
		int num = 0, sum = 0;
		
		while(num++ < 100) {
			sum += num;
		}
		System.out.println("합계: " + sum);
	}

}
