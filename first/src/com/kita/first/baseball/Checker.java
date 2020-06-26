package com.kita.first.baseball;

public class Checker {

	public static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
		int s = 0, b = 0, cnt = 0;

		// 스트라이크, 볼 검사 부분
		for (int i = 0; i < gameCnt; i++) {
			for (int z = 0; z < gameCnt; z++) {

				if (myBall.get(i) == ball.get(z)) {
					if (i == z) {
						s++;
					} else {
						b++;
					}
				}

			}

		}

		System.out.printf("S:%d/B:%d/O:%d\n", s, b, gameCnt - (s + b));
		return s != gameCnt;
	}
}
