package homework.h7;

public class Triangle extends Figure{
    private double katet1;
    private double katet2;
    private double gipotinuza;



    public double getKatet1() {
        return katet1;
    }

    public void setKatet1(double katet1) {
        this.katet1 = katet1;
    }


    public void setKatet2(double katet2) {
        this.katet2 = katet2;
    }


    public void setGipotinuza(double gipotinuza) {
        this.gipotinuza = gipotinuza;
    }
    double square;
    @Override
    public void getSquare() {
       square = (katet1*katet2)/2;
        System.out.println("square = "+square);
    }

    public double perimetr;
    @Override
    public void getPerimetr() {
        perimetr = katet1 + katet2 + gipotinuza;
        System.out.println("perimetr = "+perimetr);
    }
}
