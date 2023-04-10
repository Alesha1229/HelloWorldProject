package classwork.c7.computer;

public class Laptop extends Comp{ // дочерний класс класса Comp
    private String touchpad;

    public Laptop(String hdd, String ram, String touchpad) {
        super(hdd, ram); // super - конструктор класса родителя
        this.touchpad = touchpad; // this - конструктор этого класса
    }

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                '}';
    }

    @Override
    public void printDisplay() {
        System.out.println("This is Laptop display");

    }
}
