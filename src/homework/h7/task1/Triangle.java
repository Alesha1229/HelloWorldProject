package homework.h7.task1;

public class Triangle extends Figure{
    private double katet1;
    private double katet2;
    private double gipotinuza;


    public Triangle(double katet1, double katet2, double gipotinuza) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotinuza = gipotinuza;
    }

    double square;
    @Override
    public double getSquare() {
       square = (katet1*katet2)/2;
        System.out.println("square = "+square);
        return 0;
    }

    public double perimetr;
    @Override
    public double getPerimetr() {
        perimetr = katet1 + katet2 + gipotinuza;
        System.out.println("perimetr = "+perimetr);
        return 0;
    }
}
