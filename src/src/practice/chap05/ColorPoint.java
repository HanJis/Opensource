//실습5-06
package src.practice.chap05;

class Point{
    private int x, y;
    public Point(){
        this.x=this.y=0;
    }
    public Point(int x, int y){this. x=x;this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x, int y){
        this.x=x;this.y=y;
    }

    public void setXY(int x,int y) {
        this.x = x;this.y=y;
    }
}
public class ColorPoint extends Point{
    private String Color;
    public ColorPoint(){
        Color="BLACK";
    }
    public ColorPoint(int x, int y) {
    }
    public void setColor(String color) {
        this.Color = color;
    }
    public String toString(){
        return Color+"색의 ("+ getX()+","+getY()+")의 점";
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString()+"입니다.");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
