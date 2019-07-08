package controlLifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력받아
 * 둘 중 큰 값, 작은 값을 가려내는 클래스
 * @author pp
 *
 */

public class MinMax {

	public static void main(String[] args) {
		// 1. 선언
		// 입력받는 변수 선언
		int x;
		int y;
		//큰 값, 작은 값을 저장할 변수 선언
		int max;
		int min;
		//입력을 위한 스캐너 선언
		Scanner scan; //ctrl + shift + o : imprt
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력(space bar로 분리)");
		x = scan.nextInt();
		y = scan.nextInt();
		
		//
		
		// 3. 사용 : if ~ else 로직으로 큰 값, 작은 값 판별
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		// 출력
		System.out.printf("입력된 두 정수 : %d, %d%n", x, y);
		System.out.printf("작은 값 :%d%n", min);
		System.out.printf("큰 값 : %d%n", max);
	}

}
