package homework.h10;

import java.util.Scanner;

public class MainTask1 {
    static String format = "1234-abc-5678-def-1a2b";





    public static void main(String[] args) {
        System.out.println("Напишите номер док-та в таком формате: xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println("x-цифры, y-буквы");
        Scanner scanner = new Scanner(System.in);
        StringBuilder format = new StringBuilder();

        System.out.println("xxxx:");
        String first4x = scanner.nextLine();
        format.append(first4x);

        format.append("-");

        System.out.println("yyy:");
        String first3y = scanner.nextLine();
        format.append(first3y);

        format.append("-");

        System.out.println("xxxx:");
        String second4x = scanner.nextLine();
        format.append(second4x);

        format.append("-");

        System.out.println("yyy:");
        String second3y = scanner.nextLine();
        format.append(second3y);

        format.append("-");

        System.out.println("xyxy:");
        String xyxy = scanner.nextLine();
        format.append(xyxy);

        System.out.println(format);




        MethodsString.task1(format);





    }

}
