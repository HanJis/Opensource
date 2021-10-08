package src.practice.chap03;


import java.util.Scanner;

public class prac14 {
    public static void main(String[] args) {
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.print("과목이름>> ");
            String name = scanner.next();
            int n = 10;
            if (name.equals("그만")) {
                break;
            }
            for (int j = 0; j < 5; j++) {
                if (course[j].equals(name))
                    n = j;
            }
            if (n >= 0 && n < 5)
                System.out.println(name + "의 점수는" + score[n]);
            else
                System.out.println("없는 과목입니다.");

        }
    }


}
