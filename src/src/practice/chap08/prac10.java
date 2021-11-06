//실습8-10
package src.practice.chap08;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phone = new HashMap<String, String>();
        try {
            Scanner scanner = new Scanner(new FileReader("C:\\Temp\\phone.txt"));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String s[] = line.split(" ");
                phone.put(s[0], s[1]);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        System.out.println("총 " + phone.size() + "개의 전화번호를 읽었습니다.");
        while (true) {
            System.out.print("이름>>");
            String name = sc.next();
            if (name.equals("그만")) break;
            String namephone = phone.get(name);
            if (namephone == null)
                System.out.println("찾는 이름이 없습니다.");

            else
                System.out.println(phone.get(name));
        }
        sc.close();
    }

}