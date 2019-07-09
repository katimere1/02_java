package controlLifstmt;

import java.util.Scanner;

/**
 * 입력된 세 정수 중 가장 큰 값을 판별하는 클래스 입력값은 각각 int num1, num2, num3; 변수에 저장 가장 큰 값은 int
 * max; 변수에 저장
 * 
 * 중첩 if ~ else로 판단
 * 
 * 마지막 출력 : printf 사용
 * 
 * @author pp
 *
 */

public class MaxOfTree {

	public static void main(String[] args) {
		// 선언
		int num1;
		int num2;
		int num3;
		int max;
		Scanner scan;

		// 초기화
		scan = new Scanner(System.in);
		System.out.printf("세 정수를 입력하세요" + "(space bar로 구분)");

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 < num3) {
				max = num2;
			} else {
				max = num3;
			}
		}

	}

}
