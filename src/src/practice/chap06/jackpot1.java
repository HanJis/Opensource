//실습6- 12
package src.practice.chap06;

import java.util.Scanner;

class person1{
    String name;
    int x,y,z;
    public person1(String name){
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
public class jackpot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,Enter;
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = scanner.nextInt();
        person1 list[] = new person1[num];
        for(int i=0;i<num;i++) {
            System.out.print((i+1)+"번째 선수 이름 >>");
            name = scanner.next();
            list[i] = new person1(name);
        }
        Enter = scanner.nextLine();
        int n=1;
        while (n!=0) {
            for(int i=0;i<num;i++) {
                System.out.print("[" + list[i].name + "]:<Enter>");
                Enter = scanner.nextLine();
                if (list[i].game()) {
                    System.out.print(list[i].name + "님이 이겼습니다!");
                    n=0;
                    break;
                }
                System.out.println("아쉽군요!");
            }

        }
    }
}
