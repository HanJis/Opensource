//실습5-04
package src.practice.chap05;

import java.util.Scanner;

abstract class Converter{

    public double Change(int km,double mile){
        return km/mile;
    }
}
public class Km2Mile extends Converter{
    public double mile;
    public Km2Mile(double mile){
        this.mile=mile;
    }
    public void run(){
        System.out.println("km을 mile로 바꿉니다.");
        System.out.print("km을 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int Kilometers= scanner.nextInt();
        System.out.println("변환 결과: " +Change(Kilometers,mile)+"mile입니다");
    }
    public static void main(String[] args) {
        Km2Mile tomile = new Km2Mile(1.6);
        tomile.run();
    }
}
