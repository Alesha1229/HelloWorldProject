package homework.h7.task2;

public class Bugalter implements Printer{
    String dolznost = "Бугалтер";
    @Override
    public void printDolznost() {
        Printer.super.printDolznost();
        System.out.println(dolznost);
    }

}
