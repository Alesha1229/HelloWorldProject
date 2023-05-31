package classwork.c19.Runnable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int count;
    private AtomicInteger intCount; // для счётчиков и прочей ереси
    private volatile int counter;

    private final Object lock = new Object();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//  public synchronized void increment() throws InterruptedException { //synchronized значит что в этот метод может зайти только 1 поток за раз
//      setCount(getCount() + 1);
//      System.out.println("egegegei");
//      Thread.sleep(100);
//  }

    public void increment() throws InterruptedException {
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        intCount.incrementAndGet();
        intCount.addAndGet(10);
        intCount.decrementAndGet();
        System.out.println("egegegei");
        Thread.sleep(100);

    }
}
