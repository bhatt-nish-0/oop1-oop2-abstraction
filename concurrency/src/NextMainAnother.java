public class NextMainAnother {
    public static void main(String[] args) {
        System.out.println("main thread is running");

        try {
            System.out.println("main thread is paused for one second");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {

            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 80 dots to run.");
            for (int i =0; i< 80 ;i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    System.out.println("\nWhoops! " + tname + " interrupted ");
                    return;
                }
            }
            System.out.println("\n" + tname + " completed ");

        });

        Thread installThread = new Thread(()-> {

            try {
                for (int i =0; i< 6; i++) {
                    Thread.sleep(250);
                    System.out.println("installation step " + (i+1) + " is completed. ");
                }
            }catch (InterruptedException e) {

            }
        }, "installThread");

        System.out.println(thread.getName() + " starting... ");
        thread.start();
//        System.out.println("main thread is continuing here...");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        thread.interrupt();

        long now = System.currentTimeMillis();
//        while(thread.isAlive()) {
//            System.out.println("\nWaiting for thread to complete");
//            try{
//                Thread.sleep(1000);
//
//
//                if (System.currentTimeMillis() - now > 2000) {
//                    thread.interrupt();
//                }
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        try {
            System.out.println("main reached...");
            thread.join(); //main thread waits until thread finishes.
            System.out.println("what happened?");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!thread.isInterrupted()) {
            installThread.start();
        }else {
            System.out.println("previous thread was interrupted, " +
                    installThread.getName() + " can't run ");
        }
    }
}
