import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter3 {

    private int counter = 0;
    private Lock reEntrantLock = new ReentrantLock();

    public void increment() {
        synchronized (reEntrantLock) {
            try {
                reEntrantLock.lock();
                this.counter++;
            } finally {
                reEntrantLock.unlock();
            }
        }
    }

    public  void printCounter() {
        System.out.println(counter);
    }

}
