package classwork.c5;

import java.util.Arrays;
import java.util.Random;

public class Cw53 {
    public static void main(String[] args) {

        int[][] arr4 = new int[5][5];                           //сохдание массива 5 на 5 с рандомными числами
        Random random = new Random();

        for (int i = 0; i < arr4.length; i++) {

            for (int j = 0; j < arr4.length; j++) {
                arr4[i][j] = random.nextInt(100);
            }


        }


        System.out.println(Arrays.deepToString(arr4));

    }
}
