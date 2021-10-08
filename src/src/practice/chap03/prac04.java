
package src.practice.chap03;

import java.util.Scanner;

public class prac04 {
    public static void main(String[] args) {
        char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = s.charAt(0);
        int num = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (c == alphabet[i]) {
                num = i+1;
            }
        }
        for(int i=num;i>0;i--){
            for (int j = 0; j < i; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }



    }
}
