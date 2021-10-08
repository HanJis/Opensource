//예제4-3
package src.example.chap04;

public class Circle1 {
	int radius;
	String name;

	public Circle1() {
		radius =1; name =""; //radius의 초기값은 1
	}
	public Circle1(int r, String n) {//매개 변수를 가진 생성자
		radius = r; name= n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10, "자바피자");//Circle1 객체 생성, 반지름 10

		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);

		Circle1 donut = new Circle1();//Circle1 객체 생성, 반지름 10
		donut.name="도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
