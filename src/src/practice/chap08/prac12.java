package src.practice.chap08;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class prac12 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>>");
        String file = scanner.next();
        try {
            Scanner fScanner = new Scanner(new FileReader(file));
            while (fScanner.hasNext()) {
                String line = fScanner.nextLine();
                vector.add(line);

            }
        }catch (IOException e) {
            System.out.println("입출력 오류");
        }

        while (true) {
            System.out.print("검색할 단어나 문장>>");
            String search = scanner.next();
            if (search.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Vector<Integer> linenum = new Vector<Integer>();
            for(int i=0; i<vector.size(); i++) {
                String line = vector.get(i);
                if(line.indexOf(search) != -1)
                    linenum.add(i);
            }
            for(int i=0; i<linenum.size(); i++) {
                int lineNo = linenum.get(i);
                String line = vector.get(lineNo);
                System.out.println(lineNo + ":" + line);
            }

        }
        scanner.close();
    }
}
