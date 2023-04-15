package homework.h7.task2;

public class Rabochii implements Printer{
    String dolznost = "Рабочий";

    @Override
    public void printDolznost() {
        Printer.super.printDolznost();
        System.out.println(dolznost);
    }
}
