package homework.h10;

import java.util.Scanner;

public class NumberGenerate {
   private String xxxx1;
   private String yyy1;
   private String xxxx2;
   private String yyy2;
   private String xyxy;

    public NumberGenerate(String xxxx1, String yyy1, String xxxx2, String yyy2, String xyxy, StringBuilder format) {
        this.xxxx1 = xxxx1;
        this.yyy1 = yyy1;
        this.xxxx2 = xxxx2;
        this.yyy2 = yyy2;
        this.xyxy = xyxy;
        format.append(xxxx1);
        format.append(yyy1);
        format.append(xxxx2);
        format.append(yyy2);
        format.append(xyxy);
        System.out.println(format);

    }

    //    public static void GenerateFormat(){
//
//        System.out.println("Напишите номер док-та в таком формате: xxxx-yyy-xxxx-yyy-xyxy");
//        System.out.println("x-цифры, y-буквы");
//        StringBuilder format = new StringBuilder();
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("xxxx:");
//        //String first4x = scanner.nextLine();
//        String first4x = "1234";
//        format.append(first4x);
//
//        format.append("-");
//
//        System.out.println("yyy:");
//        //String first3y = scanner.nextLine();
//        String  first3y = "abc";
//        format.append(first3y);
//
//        format.append("-");
//
//        System.out.println("xxxx:");
//        //String second4x = scanner.nextLine();
//        String second4x = "5678";
//        format.append(second4x);
//
//        format.append("-");
//
//        System.out.println("yyy:");
//        //String second3y = scanner.nextLine();
//        String second3y = "def";
//        format.append(second3y);
//
//        format.append("-");
//
//        System.out.println("xyxy:");
//        //String xyxy = scanner.nextLine();
//        String xyxy = "1a2b";
//        format.append(xyxy);
//
//        System.out.println(format);
//    }

}
