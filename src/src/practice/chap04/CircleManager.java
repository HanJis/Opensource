//실습4-06
package src.practice.chap04;

import java.util.Scanner;

class Circle{
	private double x,y;
	public int radius;
	public Circle(double x1, double y1, int radius1) {
		x= x1;
		y=y1;
		radius = radius1;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}

}

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		int r[]=new int[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
			r[i]=radius;
		}
		int k=0;
		for(int i=0;i<r.length;i++) {
			if(r[i]>r[k]) k=i;
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[k].show();
		scanner.close();
	}

}
