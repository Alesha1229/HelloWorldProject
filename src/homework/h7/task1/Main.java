package homework.h7.task1;


public class Main {
    public static void main(String[] args) {


//        Triangle triangle1 = new Triangle(12,12,12);
//        System.out.println("трегольник №1");
//        triangle1.getPerimetr();
//        triangle1.getSquare();
//        System.out.println();
//
//
//        Circle circle1 = new Circle(12);
//        System.out.println("круг №1");
//        circle1.getPerimetr();
//        circle1.getSquare();
//        System.out.println();
//
//        Circle circle2 = new Circle(12);
//        System.out.println("круг №2");
//        circle2.getPerimetr();
//        circle2.getSquare();
//        System.out.println();
//
//
//        Rectangle rectangle1 = new Rectangle(12,12);
//        System.out.println("прямоугольник №1");
//        rectangle1.getPerimetr();
//        rectangle1.getSquare();
//        System.out.println();
//
//        Rectangle rectangle2 = new Rectangle(12,12);
//        System.out.println("прямоугольник №2");
//        rectangle2.getPerimetr();
//        rectangle2.getSquare();
//        System.out.println();

//        double sum = rectangle1.perimetr + rectangle2.perimetr + circle1.perimetr + circle2.perimetr + triangle1.perimetr;
//        System.out.println("Сумма периметров:"+sum);


        Figure[] figureItems = new Figure[5];
        figureItems[0] = new Circle(12);
        figureItems[1] = new Triangle(3,4,5);
        figureItems[2] = new Rectangle(12,18);
        figureItems[3] = new Circle(14);
        figureItems[4] = new Circle(8);
        int i = 0;
        for (Figure figure : figureItems) {
            if(i<6){
            i ++;}
            System.out.println("Фигура №"+i);
            figure.getPerimetr();
            figure.getSquare();
            System.out.println();


        }
    }






}


