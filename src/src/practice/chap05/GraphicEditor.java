//실습5-12
package src.practice.chap05;

import java.util.Scanner;

abstract class Shape1{
    private Shape1 next;
    public Shape1(){next=null;}
    public void setNext(Shape1 obj){next=obj;} //링크 연결
    public Shape1 getNext(){return next;}
    public abstract void draw();//추상 메소드
}
class Line extends Shape1{
    String string = "Line";

    @Override
    public void draw() {
        System.out.println(string);
    }
}
class Rect extends Shape1{
    String string = "Rect";
    @Override
    public void draw() {
        System.out.println(string);
    }
}
class Circle extends Shape1{
    String string = "Circle";
    @Override
    public void draw() {
        System.out.println(string);
    }
}
public class GraphicEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape1 head = null;
        Shape1 tail = null;
        Shape1 shape;
        int k = 0;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while (k != 1) {
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
                    return;
                }
                if (head == null) {
                    head = shape;
                    tail = shape;
                } else {
                    tail.setNext(shape);
                    tail = shape;
                }
            }
            else if (menunum == 2) {
                Shape1 here = head;
                Shape1 tmp = head;
                System.out.print("삭제할 도형의 위치>>");
                int deltenum = scanner.nextInt();
                int i;
                if( deltenum == 1) {
                    if(head == tail) {
                        head = null;
                        tail = null;
                    }
                    else {
                        head = head.getNext();
                    }
                }
                for(i=1; i<deltenum; i++) {
                    tmp = here;
                    here = here.getNext();
                    if(here == null) {
                        System.out.println("삭제할 수 없습니다.");
                    }
                }if(here!= null){
                if(i==deltenum) {
                    tmp.setNext(here.getNext());
                    tail = tmp;
                }
                else
                    tmp.setNext(here.getNext());
                }
            }
            else if(menunum==3){
                Shape1 n = head;
                while(n != null) {
                    n.draw();
                    n = n.getNext();
                }
            }
             else if (menunum == 4) {
                System.out.println("beauty을 종료합니다.");
                k = 1;
            }
        }
        scanner.close();
    }

}
