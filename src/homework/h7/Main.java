package homework.h7;

public class Main {
    public static void main(String[] args) {


        Triangle triangle1 = new Triangle();
        triangle1.setKatet1(3);
        triangle1.setKatet2(4);
        triangle1.setGipotinuza(5);

        System.out.println("трегольник №1");
        triangle1.getPerimetr();
        triangle1.getSquare();
        System.out.println();


        Circle circle1 = new Circle();
        circle1.setRadius(15);

        System.out.println("круг №1");
        circle1.getPerimetr();
        circle1.getSquare();
        System.out.println();

        Circle circle2 = new Circle();
        circle2.setRadius(34);

        System.out.println("круг №2");
        circle2.getPerimetr();
        circle2.getSquare();
        System.out.println();


        Rectangle rectangle1 = new Rectangle();
        rectangle1.setStorona1(5);
        rectangle1.setStorona2(8);

        System.out.println("прямоугольник №1");
        rectangle1.getPerimetr();
        rectangle1.getSquare();
        System.out.println();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setStorona1(10);
        rectangle2.setStorona2(15);

        System.out.println("прямоугольник №2");
        rectangle2.getPerimetr();
        rectangle2.getSquare();
        System.out.println();

        double sum = rectangle1.perimetr + rectangle2.perimetr + circle2.perimetr + circle1.perimetr + triangle1.perimetr;
        System.out.println("Сумма периметров = "+sum);








    }
}
