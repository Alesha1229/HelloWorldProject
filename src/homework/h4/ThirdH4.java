package homework.h4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ThirdH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int arrcount = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[arrcount];
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            if (res < arr[i]){res=arr[i];}
        }
        Arrays.sort(arr);
        System.out.println("the biggest:");
        System.out.println(arr[arrcount-1]);
        System.out.println("the lowest:");
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        float sum = IntStream.of(arr).sum();
        float srednee = sum/arrcount;
        System.out.println("srednee arifmet:");
        System.out.println(srednee);

    }
}
