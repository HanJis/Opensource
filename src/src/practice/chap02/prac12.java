/*
 * (2장 실습문제 12번)소스파일:prac12.java
 */
package src.practice.chap02;

import java.util.Scanner;

public class prac12 {
/*// 12-(1) if-else 문
	public static void main(String[] args) {
		System.out.print("연산>> ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		if(operator.equals("+"))
			System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1+num2));
		if(operator.equals("-"))
			System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1-num2));
		if(operator.equals("*"))
			System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1*num2));
		if(operator.equals("/")) {
			if(num2!=0)
				System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1/num2));
			else
				System.out.println("0으로 나눌 수 없습니다.");
		}



	}
	*/

	// 12-(2)switch 문
	public static void main(String[] args) {
		System.out.print("연산>> ");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		switch (operator) {
			case "+":
				System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1+num2));
				break;
			case "-":
				System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1-num2));
				break;
			case "*":
				System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1*num2));
				break;
			case "/":{
				if(num2!=0)
					System.out.println(num1 + operator + num2 + "의 계산 결과는 "+(num1/num2));
				else
					System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
		}
		scanner.close();
	}


}
