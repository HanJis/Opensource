/*
 *  (2장 실습문제 02번)소스파일:prac02.java
 */
package src.practice.chap02;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>> ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// 입력받은 숫자를 10으로 나누었을때의 몫(십의 자리)와 입력받은 숫자를 10으로 나누었을때의 나머지(일의 자리)를 비교한다.
		if(number/10 == number %10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No.. 10의 자리와 1의 자리가 같지 않습니다.");

		scanner.close();

	}

}