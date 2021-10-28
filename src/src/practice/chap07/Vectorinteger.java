//실습7-4
package src.practice.chap07;

import java.util.Scanner;
import java.util.Vector;

public class Vectorinteger {
    public static void main(String[] args) {
        Vector<Integer> Precipitation = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("강수량 입력(0 입력시 종료)>> ");
            int n = scanner.nextInt();
            if(n==0)break;
            Precipitation.add(n);
            for(int i=0;i<Precipitation.size();i++) {
                int num = Precipitation.get(i);
                System.out.print(num+" ");
            }
            int sum =0;
            int average=0;
            for(int i=0; i<Precipitation.size();i++){
                int num = Precipitation.elementAt(i);
                sum +=num;
                average = sum/(i+1);
            }
            System.out.println("\n현재 평균 " + average);
        }
        scanner.close();
    }
}
