package com.koreait.second;

public class Gugudan {

	public static void main(String[] args) {
		int sum;
		/*
		gugudan(2, 5);
		sum = sum(1, 2);
		System.out.println(sum);
		sum = sum(1,2,3,4,5,6,7,8,9,10, 11, 12);
		System.out.println(sum);
		System.out.println("-----------------------------");
		int result;
		result = Utils.parseStringToInt("10", 0);
		System.out.println(result);
		result = Utils.parseStringToInt("aa10", 1);
		System.out.println(result);
		result = Utils.parseStringToInt("aa10");
		System.out.println(result);
		result = Utils.parseStringToInt("9");
		System.out.println(result);
		
		int[] arr = {4,5,11,223,3,10};
		
		Utils.sortASC(arr);
		Utils.printArr(arr);
		Utils.sortDESC(arr);
		Utils.printArr(arr);
		*/
		
		//int[] rArr = Utils.createRandomArr(2, 12, 5);//1~9까지 렌덤한 값을 까지는 
		
		//Utils.printArr(rArr);
		int[] rArr2 = Utils.createRandomArrNoDuplication(1, 9, 9);
		Utils.printArr(rArr2);
		String star = makeStarTriangle(5);
		
		System.out.println(star);
		
	}
	
	public static void gugudan(int s, int e) {
		for(int i=s; i<=e; i++) {
			for(int z=1; z<10; z++) {
				if((i*z)%2 == 0){
				 System.out.printf("%d * %d = %d\n",i, z, i*z);
				}
			}
			System.out.println("");
		}
	}
	
	public static int sum(int...a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static String makeStarTriangle(int n) {
		String str =" ";
		
		for(int i = 0; i<=n; i++)
		{
			for(int z = 0; z < i; z++)
			{
				str += "*";
			}
			str += "\n";
		}
		return str;
	}

}

