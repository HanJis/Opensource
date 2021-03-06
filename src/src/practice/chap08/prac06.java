//실습8-6
package src.practice.chap08;

import java.io.*;
import java.util.Scanner;

public class prac06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String firstfile = scanner.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String secondfile = scanner.next();
        try {
            FileInputStream src = new FileInputStream(firstfile);
            FileInputStream dst = new FileInputStream(secondfile);
            FileOutputStream app =new FileOutputStream("append.txt");
            byte [] buf = new byte [1024*10];
            byte [] buf2 = new byte [1024*10];
            while(true) {
                int n = src.read(buf);
                app.write(buf, 0, n);
                if(n < buf.length) break;
            }
            while(true) {
                int n = dst.read(buf2);
                app.write(buf2, 0, n);
                if(n < buf2.length) break;
            }
            src.close();
            dst.close();
            app.close();
            System.out.println("프로젝트 폴더 밑에 append.txt. 파일에 저장했습니다.");
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();

    }
}
