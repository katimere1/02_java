package operator.ternaary;

import java.util.Scanner;

/**
 * 삼항연산자 ( 조건식 ? 값1 : 값2) 를 테스트하는 클래스
 * ------------------------------
 * 조건식 : 연산 결과가 항상 ture/false인
 *        boolean 타입의 데이터로 나와야함
 * 값1   : 조건식의 결과가 ture 일 떄 선택됨
 * 값2   : 조건식의 결과가 false 일 때 선택됨
 * ----------------------------------
 * 값1, 값2 의 데이터 타입이 일치해야 한다
 * 
 * 수학의 절댓값 계산을 할때 활용해보자.
 * 
 * @author pp
 *
 */

public class TernaryTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int x =10;
		int y - -10;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0)	? y : -y;
		
		// 3. 사용 : 출력
		System.out.printf("x=%d" 일 때,  x의 절댓값은 %d%n", x, )"
		System.out.printf
		
		// 스캐너를 사용하여 입력받은 정수에 대해
		// 절댓값을 구해보자.
		// 1. 스캐너 및 변수선언 선언
		Scanner scan; // ctrl +shift + o
		int z;
		int absZ;
		
		// 2. 스캐너 및 변수 초기화
		scan = new Scenner(System.in);
		
		// 무엇을 입력할지 알려주는 메시지 출력
		System.out.println("정수를 입력하세요.");
		z = scan.nextInt();
		
		absZ = (z >= 0) ? z : -z;
		System.out.printf("z=%d 일 때, z의 절댓값은 %d%n", z, absZ);
	}

}