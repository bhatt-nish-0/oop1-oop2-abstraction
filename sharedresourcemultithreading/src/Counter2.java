public class Counter2 {

    private int counter = 0;

    public synchronized void increment() {
        this.counter++;
    }

    public  void printCounter() {
        System.out.println(counter);
    }

}
