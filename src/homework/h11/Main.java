package homework.h11;

public class Main {

     public static String document = "1234-abс-5678-def-1a2b";

    public static void main(String[] args) throws ExceptionTask {

        System.out.println("xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println("x-цифры, y-буквы");


        try {
            Tasks.task1(document);
        } catch (Exception e){
            System.out.println("Ошибка: ABC в документе отсутствует");
        }


        try {
            Tasks.task2(document);
        } catch (Exception e){
            System.out.println("Ошибка: Документ не начинается с 555");
        }

        try {
            Tasks.task3(document);
        } catch (Exception e){
            System.out.println("Ошибка: Документ не заканчивается на 1a2b");
        }

    }


}
