public class NewMain {
    public static void main(String[] args) {
        //we've been using threads all along!
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(Thread.currentThread().getName());

        printThreadState(Thread.currentThread());
        System.out.println(currentThread);

        currentThread.setName("mainguy");
        currentThread.setPriority(Thread.MAX_PRIORITY);

        printThreadState(currentThread);

        customThread CustomThread = new customThread();
        CustomThread.start();
        //CustomThread.run();

        Runnable runnable = () -> {
            for (int i = 1; i<=5 ; i++) {
                System.out.println( " 3 ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("runnable exiting");
        };

        Thread t = new Thread(runnable);
        t.start();

        for (int i = 1; i<=5 ; i++) {
            System.out.println( " 2 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



        System.out.println("main thread exiting");
    }

    public static void printThreadState(Thread thread) {
        System.out.println("-------------------------");
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        //thread states
        /*


         */
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.isAlive());
        System.out.println("-----------------------------");
    }
}
