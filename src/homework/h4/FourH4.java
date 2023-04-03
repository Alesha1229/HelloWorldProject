package homework.h4;

import java.util.Random;
import java.util.stream.IntStream;

public class FourH4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
        }



        float sum1 = IntStream.of(arr1).sum();
        float srednee1 = sum1/5;
        System.out.print("srednee arifmet:");
        System.out.println(srednee1);

        float sum2 = IntStream.of(arr2).sum();
        float srednee2 = sum2/5;
        System.out.print("srednee arifmet:");
        System.out.println(srednee2);

        if (sum1>sum2) {
            System.out.println("sum1>sum2");
        } else if (sum1<sum2) {
            System.out.println("sum1<sum2");
        } else {
            System.out.println("sum1=sum2");
        }

    }
}
