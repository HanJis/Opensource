//실습8-8
package src.practice.chap08;

import java.io.*;
public class prac08 {
    public static void main(String[] args) {
        File f = new File("C:\\");
        File [] sf = f.listFiles();
        long n = 0;
        String name = "";
        for(int i = 0; i < sf.length; i++) {
            File temp = sf[i];
            if (n < temp.length()) {
                n = temp.length();
                name = temp.getName();
            }
        }
        System.out.println("가장 큰 파일은 " + name + " " + n + "바이트");
    }

}
