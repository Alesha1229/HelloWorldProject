package homework.h4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondH4 {

    public static void main(String[] args) {

        System.out.println("enter the number to destroy");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            if (arr[i] == num) {
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
