//실습6 - 08
package src.practice.chap06;

import java.util.Scanner;

public class Stringprac {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char s[]=new char[string.length()];
       for(int i=0;i<string.length();i++){
           s[i] = string.charAt(i);
       }
        for(int i=0;i<string.length();i++){
            System.out.print(string.substring(i+1));
            for(int j=0;j<=i;j++){
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}
