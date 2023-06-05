package homework.h19;


public class ThreadH19Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadH19 thread1 = new MyThreadH19("First");
        MyThreadH19 thread2 = new MyThreadH19("Second");
        MyThreadH19 thread3 = new MyThreadH19("Third");

        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();



    }
}
