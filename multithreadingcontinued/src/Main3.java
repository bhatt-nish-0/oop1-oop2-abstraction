import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) {

        StopWatch3 stopWatch1 = new StopWatch3(TimeUnit.SECONDS);
        StopWatch3 stopWatch2 = new StopWatch3(TimeUnit.SECONDS);
        StopWatch3 stopWatch3 = new StopWatch3(TimeUnit.SECONDS);
        Thread green = new Thread(stopWatch1::countDown,ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(()-> stopWatch2.countDown(7),ThreadColor.ANSI_PURPLE.name());
        Thread red = new Thread(stopWatch3::countDown,ThreadColor.ANSI_RED.name());
        green.start();
        purple.start();
        red.start();
    }
}

class StopWatch3 {
    private TimeUnit timeUnit;

    private int i;


    public StopWatch3(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown() {
        countDown(5);
    }

    public void countDown(int unitCount) {
        String threadName = Thread.currentThread().getName();
        ThreadColor threadColor = ThreadColor.ANSI_RESET;
        try {
            threadColor = ThreadColor.valueOf(threadName);

        }catch (IllegalArgumentException ignore) {

        }

        String color = threadColor.color();

        for (i = unitCount; i>0; i--) {
            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s%s Thread : i = %d%n", color, threadName, i);
        }
    }
}

