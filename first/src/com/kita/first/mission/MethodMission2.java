package com.kita.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		//printStar(6);
		//printStar(3);
		
		//printStarSqure(4);
		//printStarTriangle(5);
		printStarTriangleReverse(5);
	}
	
	public static void printStar(int n) {
		
		for(int i=0; i <n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	public static void printStarSqure(int n) {
		
		for(int i=0; i <n; i++) {
			printStar(n);
		}
		
	}
	public static void printStarTriangle(int n) {
		
		for(int i=1; i <=n; i++) {
			printStar(i);
		}
		
	}
	
	public static void printStarTriangleReverse(int n) {
		
		for(int i=1; i <=n; i++) {
			for(int z=0; z<n-i; z++) {
				System.out.print(" ");
			}
			printStar(i);
		}
		
	}

}
