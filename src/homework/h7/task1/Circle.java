package homework.h7.task1;

public class Circle extends Figure {
    private double pi = 3.14;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    double square;
    @Override
    public double getSquare() {
        square = pi * radius * radius;
        System.out.println("square = "+square);
        return 0;
    }
    public double perimetr;

    @Override
    public double getPerimetr() {
        perimetr = 2 * pi * radius;
        System.out.println("perimetr = "+perimetr);
        return 0;
    }
}
