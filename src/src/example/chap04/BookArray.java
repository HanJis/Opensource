//예제4-7
package src.example.chap04;

import java.util.Scanner;

class Book2{
	String title,author;
	public Book2(String title, String author) {
		this.title=title;
		this.author=author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book2 [] book =new Book2[2]; //book배열 선언

		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<book.length;i++) {
			System.out.print ("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book2(title, author); //배열 원소 객체
		}
		for(int i=0;i<book.length;i++)
			System.out.print("("+book[i].author+", "+ book[i].author+")");

		scanner.close();
	}
}