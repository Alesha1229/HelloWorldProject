package classwork.c7.flying;

public class Duck implements Flyable { // это значит что он должен соблюсти все условия, чтобы летать
    @Override
    public void fly() {
        System.out.println("Duck is flying");

    }

    @Override
    public void flyWithSound() {
        System.out.println("Duck is flying, vzuuh");

    }

    @Override
    public void printMessage() {
        Flyable.super.printMessage();
    }


}
