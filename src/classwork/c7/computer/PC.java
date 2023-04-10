package classwork.c7.computer;

public class PC extends Comp{  // дочерний класс класса Comp

    @Override
    public void printDisplay() {
        System.out.println("This is PC display");

    }

    public PC(String hdd, String ram) {
        super(hdd, ram);
    }
}
