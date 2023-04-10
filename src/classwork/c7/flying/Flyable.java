package classwork.c7.flying;

public interface Flyable {
    void fly();
    void  flyWithSound();
    default void printMessage(){
        System.out.println("this is non inf message");
    }

}
