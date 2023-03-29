package ClassWork.C4;

import java.util.Arrays;
import java.util.Random;

public class third {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            if (arr[i] == 2) {
                count += 1;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}