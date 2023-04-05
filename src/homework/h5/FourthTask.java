package homework.h5;

import java.util.Arrays;
import java.util.Random;

public class FourthTask {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(5);
                sum += arr[i][j];


            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);


    }
}

