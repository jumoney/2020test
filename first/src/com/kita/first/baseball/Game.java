package com.kita.first.baseball;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 5;
		Baseball ball = new Baseball(gameCnt);
		 MyBall myBall = new MyBall(gameCnt);
		 do {
			 myBall.setNumbers();
		 }while(Checker.check(gameCnt, ball, myBall));
		 System.out.println("게임 종료!");
	}
	

}
