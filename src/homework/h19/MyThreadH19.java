package homework.h19;

public class MyThreadH19 extends Thread{

    public MyThreadH19(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start " + getName());
        System.out.println("End " + getName());

    }
}
