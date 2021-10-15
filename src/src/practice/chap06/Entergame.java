//실습6-06
package src.practice.chap06;

import java.util.Scanner;
import java.util.Calendar;
class game{
    String name;
    int start,end;
    Calendar now = Calendar.getInstance();
    Scanner scanner = new Scanner(System.in);
    public game(String name){
        this.name=name;
    }
    public void run(){
        System.out.print(name+"시작 <Enter>키 >>");
        String Enter = scanner.nextLine();

        now = Calendar.getInstance();
        start= now.get(Calendar.SECOND);
        System.out.println("    현재 초 시간 = "+start);

        System.out.print("10초 에상후 <Enter>키 >>");
        Enter = scanner.nextLine();

        now = Calendar.getInstance();
        end= now.get(Calendar.SECOND);
        System.out.println("    현재 초 시간 = "+end);

    }
    public int result(){
        if(start<end)
            return end-start;
        else
            return (60 -start) + end;
    }

}
public class Entergame {
    public static void main(String[] args) {
        String Enter;
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        game one = new game("황기태");
        game two = new game("이재문");
        one.run();
        two.run();
        if(Math.abs(one.result()-10)<Math.abs(two.result()-10))
            System.out.println(one.name+"의 결과"+one.result()+two.name+"의 결과"+two.result()+", 승자는 "+one.name);
        else
            System.out.println(one.name+"의 결과"+one.result()+two.name+"의 결과"+two.result()+", 승자는 "+two.name);

    }

}
