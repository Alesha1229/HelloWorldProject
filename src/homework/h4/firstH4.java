package homework.h4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class firstH4 {
    public static void main(String[] args) {

        System.out.println("enter the number to search");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            if (arr[i] == num) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
}
