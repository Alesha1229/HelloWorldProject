package homework.h11;

public class Tasks {

    public static void task1(String ) throws ExceptionTask1 {
        System.out.println("- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        format = format.toLowerCase();
        if(format.contains("abc")) throw new ExceptionTask1 ("wsfsdf",123123);

        //System.out.println("ABC в документе присутствует");
        //throw new ExceptionTask1 ("dsfdsf",);



            //System.out.println("ABC в документе отсутствует");

        System.out.println("....................................................");
    }

    public static void task2(String format){
        System.out.println("Проверить начинается ли номер документа с последовательности 555");

        if(format.startsWith("555")){
            System.out.println("Документ начинается с 555");
        } else {
            System.out.println("Документ не начинается с 555");
        }
        System.out.println("....................................................");


    }

    public static void task3(String format){
        System.out.println("Проверить заканчивается ли номер документа на последовательность 1a2b");

        if(format.endsWith("1a2b")){
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            System.out.println("Документ не заканчивается на 1a2b");
        }
        System.out.println("....................................................");


    }

















    }
