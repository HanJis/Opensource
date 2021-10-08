/*
 * 소스 파일: MultipleOfThree.java
 */
package src.example.hello;

import java.util.Scanner;

public class MultipleOfThree {
	public static void mian(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int number = in.nextInt();

		if(number%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");

		in.close();

	}

}