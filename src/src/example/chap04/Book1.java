//예제4-5
package src.example.chap04;

public class Book1 {
	String title;
	String author;
	void show() {System.out.println(title+" "+ author);	}

	public Book1() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book1(String title) {
		this(title,"작자미상");
	}
	public Book1(String title, String author) {
		this.title=title; this.author=author;
	}
	public static void main(String[] args) {
		Book1 littlePrince=new Book1("어린왕자","생텍쥐페리");
		Book1 loveStory = new Book1("bible");
		Book1 emptyBook = new Book1();
		loveStory.show();

		//bible.show(); 오류가 납니다..
	}
}

