package classwork.c5;

import java.util.Arrays;

public class CwEquals54 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int[] newArr = new int[10];
        //arr[9] = 1; // ассивы не одинаковые, следовательно false

        System.out.println(Arrays.equals(arr, newArr)); // сравнение массиво
        System.out.println(Arrays.compare(arr, newArr));

    }
}
