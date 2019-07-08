package controlLifstmt;

import java.util.Scanner;

public class Findmax {

	public static void main(String[] args) {
		// 1. 선언 2.초기화
		int x;
		int y;
		int max = 0;
		Scanner scan;
		// 초기화
		scan =  new Scanner(System.in);
		
		// 입력을 알리는 메시지
		System.out.println("두 정수를 입력(space bar 로 분리)");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. 사용 : 입력된 두 값을 비교
		if (x < y) { 
			max = y;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 "
                    + "큰 값은 %d%n", x, y, max);
		}
				
		if (y < x) {
			max = x;
			System.out.printf("입력된 두 값 x=%d, y=%d 중 "
                    + "큰 값은 %d%n", x, y, max);
		}
		
		if (x == y) {
			System.out.printf("입력된 두 값 x=%d, y=%d 이 동일합니다.", x, y, max);
		}
				

	}

}
