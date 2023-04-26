package homework.h10;

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {




              System.out.println("Напишите номер док-та в таком формате: xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println("x-цифры, y-буквы");
        StringBuilder format = new StringBuilder();
        Scanner scanner = new Scanner(System.in);


        System.out.println("xxxx:");
        //String first4x = scanner.nextLine();
       String first4x = "1234";
        format.append(first4x);

        format.append("-");

       System.out.println("yyy:");
       //String first3y = scanner.nextLine();
       String  first3y = "abc";
       format.append(first3y);

       format.append("-");

       System.out.println("xxxx:");
       //String second4x = scanner.nextLine();
       String second4x = "5678";
       format.append(second4x);

       format.append("-");

       System.out.println("yyy:");
       //String second3y = scanner.nextLine();
       String second3y = "def";
       format.append(second3y);

       format.append("-");

       System.out.println("xyxy:");
       //String xyxy = scanner.nextLine();
       String xyxy = "1a2b";
       format.append(xyxy);

       System.out.println(format);


    }

}
