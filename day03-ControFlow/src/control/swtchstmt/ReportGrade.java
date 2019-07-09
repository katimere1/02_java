package control.swtchstmt;

import java.util.Scanner;

/**
 * /**
 * switch 구문 사용하여 다음의 기준으로 학점을 계산하는 클래스
 *  --------------------------------------
 * A : 90점 이상 B : 80~89 점 사이 C : 60~79점 사이 D : 40~59 점 사이 F : 이하 나머지
 * ----------------------------------------------
 * printf 로 출력
 * @author pp
 *
 */

public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;

		// 입력안내
		Scanner scan = new Scanner(System.in);
		System.out.printf("학점을 입력하세요.");
		score = scan.nextInt();
		switch (score / 10) {
		case 9 : case 10 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 : case 6 :
			grade = 'C';
			break;
		case 5 : case 4  :
			grade = 'D';
			break;
			default :
				grade = 'F';
		
			System.out.printf("점수 : %d, 학점 :%d%n", score, grade);
			
			
		}
		
		

	}

}
