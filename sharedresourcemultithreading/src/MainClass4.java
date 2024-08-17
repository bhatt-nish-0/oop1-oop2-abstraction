import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClass4 {
    public static void main(String[] args) {

        Counter4 counter = new Counter4();

        Runnable myRunnable1 = () -> {
            for (int i = 0; i<10000; i++) {
                counter.increment();
            }
        };

        Runnable myRunnable2 = () -> {
            for (int i =0; i<10000; i++) {
                counter.increment();
            }
        };

//        Thread t1 = new Thread(myRunnable1);
//        Thread t2  = new Thread(myRunnable2);
//
//        t1.start();
//        t2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(myRunnable1);
        executorService.submit(myRunnable2);

        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        counter.printCounter();
    }
}
