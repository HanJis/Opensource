//실습8-4
package src.practice.chap08;

import java.io.*;
import java.util.Scanner;

public class systemline {

        public static void main(String[] args) {
            System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
            FileReader fin = null;
            int lineNumber=1;
            try {
                fin = new FileReader("c:\\windows\\system.ini");
                Scanner fscanner = new Scanner(fin);
                while (fscanner.hasNext()) {
                    String line = fscanner.nextLine();
                    System.out.printf("%2d: ", lineNumber);
                    System.out.println(line);
                    lineNumber++;
                }
                fin.close();
                fscanner.close();
            }
            catch (IOException e) {
                System.out.println("입출력 오류");
            }
        }

    }
