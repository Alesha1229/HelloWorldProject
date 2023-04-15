package homework.h7.task2;

public class Direktor implements Printer {
    String dolznost = "Директор";
    @Override
    public void printDolznost() {
        Printer.super.printDolznost();
        System.out.println(dolznost);
    }



}

