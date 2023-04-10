package classwork.c7.computer;

import classwork.c7.flying.AirPLane;
import classwork.c7.flying.Duck;
import classwork.c7.flying.Flyable;

public class LessonMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a","b","c");
        laptop.setHdd("10");
        PC pc = new PC("a", "b");
        pc.setHdd("20");

       // System.out.println(laptop);
        Comp myBestComp = new Laptop("c","d","e");
        System.out.println(myBestComp);

        laptop.printDisplay();

        AirPLane plane = new AirPLane();
        plane.fly();
        plane.flyWithSound();
        plane.printMessage();

        AirPLane duck = new AirPLane();
        duck.fly();
        duck.flyWithSound();
        duck.printMessage();

        Flyable[] flyItems = getFlyables();
        for (Flyable flyable: flyItems){
            flyable.flyWithSound();
        }
    }

    private static Flyable[] getFlyables() {
        Flyable[] flyItems = new Flyable[4];
        flyItems[0] = new Duck();
        flyItems[1] = new AirPLane();
        flyItems[2] = new Duck();
        flyItems[3] = new AirPLane();
        return flyItems;
    }
}
