//실습5-08
package src.practice.chap05;

class Point1{
    private int x, y;
    public Point1(int x, int y){if(x>0&&y>0){this. x=x;this.y=y;}}
    public Point1(){this.x=this.y=0;}
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x, int y){
        if(x>0&&y>0) {
            this.x = x;
            this.y = y;
        }
    }
}

public class PositivePoint extends Point1{
    public PositivePoint(){
        super();
    }
    public PositivePoint(int x, int y){
        super(x,y);
    }
    public String toString(){
        return "("+getX()+","+getY()+")의 점";
    }
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");

        p.move(-5,5); //객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString()+"입니다.");
    }
}
