/*
 * (2장 실습문제 04번)소스파일:prac04.java
 */
package src.practice.chap02;

import java.util.Scanner;

public class prac04 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력>> ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int number = num3;

		if(num2 > num1) {
			if(num2<num3)
				number=num2; // num3>num2>num1
			if(num3<num1)
				number=num1; // num2>num1>num3
		}
		else {
			if(num2>num3)
				number = num2; // num1>num2>num3
			if(num1<num3)
				number = num1; // num3>num1>num2
		}
		//조건문을 통해 num2또는 num1이 중간값이 되는 모든 경우를 나타냈기에 if문이전에 number를 선언할때 number=num3을 선언함.

		System.out.println("중간 값은 " + number);

		scanner.close();

	}

}