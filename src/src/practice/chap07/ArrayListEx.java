//실습 7-2
package src.practice.chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0;i<6;i++){
            char abc = scanner.next().charAt(0);
            al.add(abc);
        }
        double sum =0;
        for(int i=0;i<6;i++){
            char ABC = al.get(i);
            switch (ABC) {
                case 'A': sum +=4.0;break;
                case 'B': sum +=3.0;break;
                case 'C': sum +=2.0;break;
                case 'D': sum +=1.0;break;
                case 'F': sum +=0.0;break;
            }
        }
        System.out.println(sum/6);
        scanner.close();
    }
}
