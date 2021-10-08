package src.practice.chap03;

import java.util.Scanner;

public class prac08 {
    public static void main(String[] args) {
        System.out.print("정수 몇개? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }
        for(int i = 0; i < (number / 10) + 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (i * 10 + j < number) {
                    System.out.print(arr[i * 10 + j] + " ");
                }
            }
            System.out.println();
        }
    }
}

