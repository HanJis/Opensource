//실습7-10
package src.practice.chap07;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape{
    private Shape next;
    public Shape(){next=null;}
    public void setNext(Shape obj){next=obj;} //링크 연결
    public Shape getNext(){return next;}
    public abstract void draw();//추상 메소드
}
class Line extends Shape{
    String string = "Line";

    @Override
    public void draw() {
        System.out.println(string);
    }
}
class Rect extends Shape{
    String string = "Rect";

    @Override
    public void draw() {
        System.out.println(string);
    }
}
class Circle extends Shape{
    String string = "Circle";

    @Override
    public void draw() {
        System.out.println(string);
    }
}

public class Vectorshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Shape> s =new Vector<Shape>();
        Shape shape = null;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
            int menunum = 0;
            menunum = scanner.nextInt();
            if (menunum == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>> ");
                int shapenum = scanner.nextInt();
                if (shapenum == 1) {
                    shape = new Line();
                } else if (shapenum == 2) {
                    shape = new Rect();
                } else if (shapenum == 3) {
                    shape = new Circle();
                } else {
                    System.out.println("다시 입력해주세요.");
                }
                    s.add(shape);
            }
            else if (menunum == 2){
                System.out.print("삭제할 도형의 위치>>");
                int deltenum = scanner.nextInt();
                if(deltenum>s.size()){
                    System.out.println("삭제할 수 없습니다.");
                }
                else 
                    s.remove(deltenum);
                
            }
            else if(menunum==3){
                for(int i=0;i<s.size();i++)
                    s.get(i).draw();
            }
            else if(menunum==4) {
                System.out.println("beauty을 종료합니다.");
                break;
            }
        }
    }
}
