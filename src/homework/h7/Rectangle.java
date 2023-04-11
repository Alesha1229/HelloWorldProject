package homework.h7;

public class Rectangle extends Figure{
    private double storona1;
    private double storona2;

    public void setStorona1(double storona1) {
        this.storona1 = storona1;
    }

    public void setStorona2(double storona2) {
        this.storona2 = storona2;
    }

    double square;
    @Override
    public void getSquare() {
       square = storona1 * storona2;
        System.out.println("square = "+square);
    }

    double perimetr;
    @Override
    public void getPerimetr() {
        perimetr = storona1 * storona2 * 2;
        System.out.println("perimetr = "+perimetr);
    }
}
