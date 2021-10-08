package src.practice.chap03;

import java.util.Random;

public class prac10 {
    public static void main(String[] args) {
        int arr[] = new int[16];
        int arr_rand[][] = new int[4][4];
        for (int i = 0; i < 16; i++) {
            if (i < 10)
                arr[i] = (int) (Math.random() * 10 + 1);
            if (i >= 10)
                arr[i] = 0;
        }
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int randIx = rand.nextInt(i + 1);
            int temp = arr[randIx];
            arr[randIx] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0;i<arr_rand.length ; i++){
            for(int j=0;j<arr_rand[i].length;j++){
                arr_rand[i][j]=arr[i*4+j];
            }
        }


            for (int i = 0; i < arr_rand.length; i++) {
                for (int j = 0; j < arr_rand[i].length; j++) {
                    System.out.print(arr_rand[i][j] + " ");
                }
                System.out.println();
            }
    }
}
