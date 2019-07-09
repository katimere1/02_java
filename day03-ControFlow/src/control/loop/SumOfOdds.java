package control.loop;

/**
 * while 문을 이용하여 1~100 사이의 홀수의 합을 구하는 클래스
 * @author pp
 *
 */

public class SumOfOdds {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		while(num <= 100) {
			if (num % 2 == 1) {
				sum += num;
			}
			num++;
		}
		System.out.printf("1부터 100사이 홀수의 합은 %d입니다., %n", sum);
	}

}
