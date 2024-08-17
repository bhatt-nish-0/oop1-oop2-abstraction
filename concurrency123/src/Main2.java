public class Main2 {
    public static void main(String[] args) {
        System.out.println("main thread running");
        try {
            System.out.println("main thread is paused for a sec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 10 dots to run ");
            for (int i =0; i<10; i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("interrupted!");
                    return;
                }
            }
            System.out.println("completed");
        });
        System.out.println(thread.getName() +  " starting ");

        thread.start();

        System.out.println("main thread continues");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
