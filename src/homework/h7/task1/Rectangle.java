package homework.h7.task1;

public class Rectangle extends Figure{
    private double storona1;
    private double storona2;

    public Rectangle(double storona1, double storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    double square;
    @Override
    public double getSquare() {
       square = storona1 * storona2;
        System.out.println("square = "+square);
        return 0;
    }

    double perimetr;
    @Override
    public double getPerimetr() {
        perimetr = storona1 * storona2 * 2;
        System.out.println("perimetr = "+perimetr);
        return 0;
    }
}
