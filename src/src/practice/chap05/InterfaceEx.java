//실습5-14
package src.practice.chap05;

interface Shape{
    final double PI =3.14; //상수
    void draw(); //도형을 그리는 추상 메소드
    double getArea(); //도형의 면적을 리턴하는 추상 메소드
    default public void redraw(){ //디폴트 메소드
        System.out.print("--- 다시 그립니다.");
        draw();
    }

}
class Circle1 implements Shape{
    int r;
    public Circle1(int r){
        this.r=r;
    }
    @Override
    public void draw() {
        System.out.println("반지름이 "+r+"인 원입니다.");
    }

    @Override
    public double getArea() {
        return r*r*PI;
    }
}
class Oval1 implements Shape{
    int x,y;
    public Oval1(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void draw() {
        System.out.println(x+"x"+y+"에 내접하는 타원 입니다.");
    }

    @Override
    public double getArea() {
        return  PI*x*y;
    }
}
class Rect1 implements Shape{
    int x, y;
    public Rect1(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void draw() {
        System.out.println(x+"x"+y+"크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return x*y;
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Shape [] list = new Shape[3];
        list[0] = new Circle1(10);
        list[1] = new Oval1(20,30);
        list[2] = new Rect1(10,40);
        for(int i=0;i< list.length;i++) list[i].redraw();
        for(int i=0;i< list.length;i++) System.out.println("면적은" +list[i].getArea());
    }
}
