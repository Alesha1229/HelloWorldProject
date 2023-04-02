package homework.h3;

import java.util.Scanner;

public class H3SecondTask {
    public static void main(String[] args) {
        int res = 0;

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 100 && number < 0) {
            System.out.println("Bad number :(");
        } else {
            for (int count = 0; count < number; count++) {
                res += count;
            }

        }
        System.out.println(res);

    }
}
