//실습4-02문제
package src.practice.chap04;

import java.util.Scanner;

public class Grade {
	private	int math;
	private int science;
	private int english;

	public Grade(int math_score, int science_score,int english_score) {
		math = math_score;
		science = science_score;
		english = english_score;
	}
	public double averge() {
		return (math+science+english)/3;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수학, 과학, 영어순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은" + me.averge());//average()는 평균을 계산하여 리턴

		scanner.close();
	}
}
