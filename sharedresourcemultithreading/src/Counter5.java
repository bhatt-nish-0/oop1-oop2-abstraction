import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter5 {

    private int counter = 0;
    private Lock reEntrant = new ReentrantLock();

    public  void increment() {

        System.out.println("thread " + Thread.currentThread().getName() + " has accessed ");
        this.doSomethingStupid();
        reEntrant.lock();
        try {
            this.counter++;
            System.out.println(counter + " " + Thread.currentThread().getName()) ;
        } catch (Exception e) {

        } finally {
            reEntrant.unlock();
        }

    }

    private void doSomethingStupid() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void printCounter() {
        System.out.println(counter);
    }

}
