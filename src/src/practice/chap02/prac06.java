/*
 * (2장 실습문제 06번)소스파일:prac06.java
 */
package src.practice.chap02;

import java.util.Scanner;

public class prac06 {

	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();

		//십의 자리와 일의자리 분리
		int tenth_digit= number / 10; //십의 자리
		int one_digit = number % 10; //일의 자리

		int count=0; //3,6,9 갯수를 세기위한 변수 선언


		if(tenth_digit!=0 &&tenth_digit %3==0) {
			count++; //십의 자리가 3으로 나누어질때 카운트 +1
			if(one_digit%3==0)
				count++; //십의자리가 3을 나누어지고 일의 자리가 3으로 나누어질 때 카운트 +1
		}
		else {
			if(one_digit%3==0)
				count++; //십의자리가 3으로 나누어떨어지지않고 일의 자리가 3으로 나누어질때 카운트 +1
		}
		// 1~99까지의 정수 중 입력한 정수에 3,6,9가 하나 있는경우
		if(count==1)
			System.out.println("박수짝");
		// 1~99까지의 정수 중 입력한 정수에 3,6,9가 두개 있는경우
		if(count==2)
			System.out.println("박수짝짝");

		scanner.close();
	}
}