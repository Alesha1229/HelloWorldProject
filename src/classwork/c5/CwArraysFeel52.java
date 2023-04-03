package classwork.c5;

import java.util.Arrays;

public class CwArraysFeel52 {
    public static void main(String[] args) {

        int[][] arr3 = new int[4][];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];

        }


        int x = 0;
        int y = 1;
        for (; x < arr3.length; ) {               //заполнение массива
            Arrays.fill(arr3[x++], y++);
        }


        System.out.println(Arrays.deepToString(arr3));
    }
}