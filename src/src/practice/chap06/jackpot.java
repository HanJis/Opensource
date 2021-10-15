//실습6-10
package src.practice.chap06;

import java.util.Scanner;

class person{
    String name;
    int x,y,z;
    public person(String name){
        this.name=name;
    }
    public boolean game(){
        x=(int)(Math.random()*3+1);
        y=(int)(Math.random()*3+1);
        z=(int)(Math.random()*3+1);
        System.out.print("       "+x+" "+y+" "+z+"    ");
        if(x==y&&y==z)
            return true;
        else
            return false;
    }
}
public class jackpot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,Enter;
        System.out.print("1번째 선수 이름 >>");
        name = scanner.next();
        person first= new person(name);
        System.out.print("2번째 선수 이름 >>");
        name = scanner.next();
        Enter = scanner.nextLine();
        person second = new person(name);
        while (true) {
            System.out.print("[" + first.name + "]:<Enter>");
            Enter = scanner.nextLine();
            if (first.game()) {
                System.out.print(first.name + "님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
            System.out.print("[" + second.name + "]:<Enter>");
            Enter = scanner.nextLine();
            if (second.game()) {
                System.out.println(second.name + "님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");

        }
    }
}
