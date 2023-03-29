package ClassWork.C4;

import java.util.Arrays;
import java.util.Random;

public class ClassWorkPartsecond {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            if (res < arr[i]){res=arr[i];}
        }Arrays.sort(arr);
            System.out.println(arr[4]);
            System.out.println(Arrays.toString(arr));

    }
}

