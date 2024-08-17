public class MainClass6 {
    public static void main(String[] args) {

        Counter6 counter = new Counter6();

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

        Thread t1 = new Thread(myRunnable1);
        Thread t2  = new Thread(myRunnable2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        counter.printCounter();
    }
}
