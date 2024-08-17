public class Counter6 {

    private int counter = 0;

    public synchronized void increment() {

        System.out.println("thread " + Thread.currentThread().getName() + " has accessed ");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.counter++;
        System.out.println(counter + " " + Thread.currentThread().getName());
    }

    public  void printCounter() {
        System.out.println(counter);
    }

}
