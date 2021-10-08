package src.practice.chap03;

import java.util.Scanner;

public class prac16 {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        for (int i = 0; ; i++) {
            System.out.print("가위 바위 보!>> ");
            String RockPaperScissors = scanner.next();
            if (RockPaperScissors.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            int n = (int) (Math.random() * 3);
            int m=0;
            for(int j=0;j<3;j++){
                if(RockPaperScissors.equals(str[j]))
                m = j;
            }
            System.out.print("사용자 = " + str[m] + " , 컴퓨터 = " + str[n]);
            if (n==m) {
                System.out.println(", 비겼습니다.");
            }
            if ((n==0&&m==1)||(n==1&&m==2)||(n==2&&m==0)){
                System.out.println(", 사용자가 이겼습니다.");
            }
            if ((m==0&&n==1)||(m==1&&n==2)||(m==2&&n==0)){
                System.out.println(", 컴퓨터가 이겼습니다.");
            }


        }
    }
}
