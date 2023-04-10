package classwork.c7.flying;

public class AirPLane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane if fly");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Airplane is fly, zhzhzhhzhzh");
    }
}
