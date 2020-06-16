package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("성별을 입력해 주세요(남/여): \n");
		String gender = new String();
		gender = scan.nextLine();
		System.out.printf("키를 입력해 주세요: \n");
		int heigt = scan.nextInt();
		
		if(gender.equals("남"))
		{
			if(heigt == 160)
			{
				System.out.println("평균입니다.");
			}
			else if(heigt > 160)
			{
				System.out.println("평균 초과입니다.");
			}
			else {
				System.out.println("평균 미만입니다.");
			}
			
		}
		else if(gender.equals("여"))
		{
			if(heigt == 150)
			{
				System.out.println("평균입니다.");
			}
			else if(heigt > 150)
			{
				System.out.println("평균 초과입니다.");
			}
			else {
				System.out.println("평균 미만입니다.");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
