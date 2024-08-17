public class Main4 {
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

        Thread installThread = new Thread(() -> {
           try {
               for (int i =0; i<3; i++) {
                   Thread.sleep(250);
                   System.out.println("installation thread " + i + " completed ");
               }


           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });


        System.out.println(thread.getName() +  " starting ");

        thread.start();

        long now = System.currentTimeMillis();
//        while (thread.isAlive()) {
//            System.out.println("waiting for thread to complete");
//            try {
//                Thread.sleep(1000);
//
//
//                if (System.currentTimeMillis() - now > 2000) {
//                    thread.interrupt();
//                }
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!thread.isInterrupted()) {
            installThread.start();
        } else {
            System.out.println("cant run");
        }


        //System.out.println("C.State = " + thread.getState());

        //new
        //runnable
        //blocked
        //waiting
        //timed_waiting
        //terminated


    }
}
