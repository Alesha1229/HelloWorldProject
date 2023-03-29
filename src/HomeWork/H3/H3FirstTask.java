package HomeWork.H3;

import java.util.Scanner;

public class H3FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of color(1-7)");
        int color = scanner.nextInt();
        switch (color) {
            case 1:
                System.out.println("This is Red color!");
                break;
            case 2:
                System.out.println("This is Orange color!");
                break;
            case 3:
                System.out.println("This is Yellow color!");
                break;
            case 4:
                System.out.println("This is Green color!");
                break;
            case 5:
                System.out.println("This is Light blue color!");
                break;
            case 6:
                System.out.println("This is Blue color!");
                break;
            case 7:
                System.out.println("This is Purple color!");
                break;
        }


    }
}
