//실습8-4
package src.practice.chap08;

import java.io.*;
import java.util.Scanner;

public class systemline {

        public static void main(String[] args) {
            System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
            FileReader fin = null;
            int i=1;
            try {
                fin = new FileReader("c:\\windows\\system.ini");
                Scanner scanner = new Scanner(fin);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    System.out.print(i+": ");
                    System.out.println(line);
                    i++;
                }
                fin.close();
                scanner.close();
            }
            catch (IOException e) {
                System.out.println("입출력 오류");
            }
        }

    }
