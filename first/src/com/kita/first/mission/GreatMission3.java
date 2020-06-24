package com.kita.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = { { 90, 100, 88 }, // 영어
				{ 34, 99, 45 }, // 수학
				{ 98, 65, 87 }, // 국어
				{ 67, 35, 43}	//과학
		};
		
		String[] clsArr = { "영어", "수학", "국어", "과학" }; //과목명 출력용
		int[] sumArr = new int[clsArr.length]; //과목별 합계점수 저장용

		/*
		 * 영어합계: ? 평균: ? 수학합계: ? 평균: ? 국어합계: ? 평균: ? 전체합계: ? 평균: ?
		 */
		
		//합 배열에 값 삽입.
		for (int i = 0; i < arr.length; i++) {
			for (int z = 0; z < arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
			
		}
		
		int totalSum = 0; //전체합계용
		int totalCnt = 0; //전체평균을 계산하기 위한 카운트(과목별 아이템 수 모두 더 함)
		//합, 평균 출력.
		for (int i = 0; i < sumArr.length; i++) {

			System.out.printf("%s합계: %d, 평균: %.1f\n"
					, clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
		}
		//전체합계 출력.
		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCnt);
	}

}

