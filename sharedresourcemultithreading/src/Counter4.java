import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter4 {

    private int counter = 0;

    private final Lock lock = new ReentrantLock();

    public /*synchronized*/ void increment() {
        lock.lock();
        try {
            this.counter++;
        } finally {
            lock.unlock();
        }
    }

    public  void printCounter() {
        System.out.println(counter);
    }

}
