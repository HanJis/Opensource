//예제 6-2 : Point 클래스에 toString() 작성
package src.example.chap06;

class Point1{
    int x,y;
    public Point1(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Point("+x+","+y+")";
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Point1 p= new Point1(2,3);
        System.out.println(p.toString());
        System.out.println(p); //p는 p.toString으로 자동 변환
        System.out.println(p+"입니다."); //p.toString()+"입니다"로 자동 변환
    }
}
