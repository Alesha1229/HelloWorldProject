package HomeWork.H2;

import java.util.Scanner;
public class SecondHomework {


    public static void main (String[] args) {

        String a = "This is my second homework :)";
        System.out.println(a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name, user?");
        String name = scan.nextLine();
        System.out.printf("Hello ;), %s ", name);
        scan.close();
    }
}