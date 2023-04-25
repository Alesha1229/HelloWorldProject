package homework.h10;

public class MainTask1 {
    String format = "1234-abc-5678-def-1a2b";

    public String getFormat() {
        return format;
    }

    public static void main(String[] args) {
        System.out.println("Напишите номер док-та в таком формате: xxxx-yyy-xxxx-yyy-xyxy");
        String format = "1234-abc-5678-def-1a2b";

        System.out.println("- Вывести на экран в одну строку два первых блока по 4 цифры.");
        System.out.print(format.substring(0,4));
        System.out.println(format.substring(9,13));


    }

}
