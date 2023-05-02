package homework.h11;

public class ExceptionTask1 extends Tasks{
    private int age;
    public ExceptionTask1(String message1, int age) {
        super(message1);
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
