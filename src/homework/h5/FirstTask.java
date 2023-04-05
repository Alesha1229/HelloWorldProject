package homework.h5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, на которое нужно увеличить каждый элемент массива");
        int num = scanner.nextInt();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1; //можно и рандом, но так видно что пронрамма работает
                arr[i][j] += num;

            }
        }


        System.out.println(Arrays.deepToString(arr));

    }
}
