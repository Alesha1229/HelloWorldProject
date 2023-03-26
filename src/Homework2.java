import java.util.Scanner;
public class Homework2 {


    public static void main (String[] args) {

        String a = "This is my second homework :)";
        System.out.println(a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name, user?");
        String txt = scan.nextLine();
        System.out.printf("Hello ;), %s ", txt);
        scan.close();
    }
}