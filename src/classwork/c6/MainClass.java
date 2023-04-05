package classwork.c6;

public class MainClass {
    public static void main(String[] args) {
       /* Car myBmw = new Car();
        myBmw.color = "Green";
        myBmw.age = 2023;
        myBmw.brand = "BMW";
        System.out.println(myBmw.color);
        System.out.println(myBmw.age);
        System.out.println(myBmw.brand);
        System.out.println(myBmw.wheelNumber);*/


        Car myBestBMW = new Car("Blue", 2023, "BMW", 4, true, "Auto");
        System.out.println(myBestBMW.getColor());
        myBestBMW.setColor("Grey");
        System.out.println(myBestBMW.getColor());
        System.out.println(myBestBMW);

        myBestBMW.startDriving();
        myBestBMW.changeSpeed(10);
        myBestBMW.goDirectly();
        myBestBMW.changeSpeed(50);
        System.out.println("СВЕТ0ФОР");
        myBestBMW.changeSpeed(-20);
        myBestBMW.switchDirection(true);
        myBestBMW.goDirectly();
        myBestBMW.changeSpeed(30);
        myBestBMW.switchDirection(false);
        myBestBMW.sound();
        myBestBMW.changeSpeed(-70);



    }
}
