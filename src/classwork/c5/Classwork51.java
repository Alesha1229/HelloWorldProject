package classwork.c5;

import java.util.Arrays;

public class Classwork51 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[][] arr2 = new int[10][10];


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) { // 1 способ
                arr2[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {  // 2 способ
                System.out.println(" arr[i][j] = " + arr2[i][j]);
            }
            System.out.println();
        }


    }
}
