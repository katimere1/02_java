package controlLifstmt;

import java.util.Scanner;

/**
 * 두 정수 중 작은 값을 가려내는 클래스
 * 두 정수는 Scanner 로 입력받는다.
 * @author pp
 *
 */

public class Finmin {

	public static void main(String[] args) {
		// 1. 선언 : 입력받을 변수, 작은 값을 저장할 변수
		int x;
		int y;
		int min = 0;
		Scanner scan; //ctrl + shift + o : imprt

		// 2. 초기화
		scan = new Scanner(System.in);
		
		// 입력을 알리는 안내 메시지
		System.out.println("두 정수를 입력(space bar 로 분리)");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. 사용 : 입력된 두 값을 비교(if)
		if (x < y) {
			min = x;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 "
                    + "작은 값은 %d%n", x, y, min);
		}
		
		if (y < x) {
			min =y;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 "
                    + "작은 값은 %d%n", x, y, min);
		}
		
		if (x == y) {
		System.out.printf("입력된 두 값 x=%d, y=%d 이 동일합니다.", x, y, min);
	}

}
}