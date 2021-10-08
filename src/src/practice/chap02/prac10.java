package src.practice.chap02;

import java.util.Scanner;

public class prac10 {

	public static void main(String[] args) {
		System.out.print("첫번째의 원의 중심과 반지름 입력>> ");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.print("두번째의 원의 중심과 반지름 입력>> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
//원의 중심을 서로 연결한 길이가 반지름의 합보다 크거나 같으면 만난다.
		int l = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		if((r1+r2)*(r1+r2) >= l)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
	}

}