import java.util.concurrent.TimeUnit;

public class Intro {
    public static void main(String[] args) {



        //process - unit of execution that has its own memory space
        //process and application are often used interchangeably
        //heap isnt shared between 2 applications , they each have their own

        //thread is a single unit of execution within a process
        //each process can have multiple threads.
        //every application has at least one thread, the main thread.
        //we will create threads, execute them, and manage them.
        // thread created by a process, shares that process's heap.
        //this can cause big probs.

        //each thread has its own thread stack - single thread will have access to
        //every java app runs as a single process.. each process can have multiple threads..
        //every process has a heap... and every thread has a thread stack...

        //why multithreading?
        //offload long running tasks..
        //tasks that take a long time -- can use another thread..
        //this frees up the main thread .. so that the user doesnt feel the application has died. .
        // concurrency - allows different parts of a program to make progress independently..
        // concurrent - download a bit of data, then switch to drawing more of a shape..
        // multiple threads can make incremental progresss...

        //

        //we;ve been using a thread all along - the main thread..

        Thread thread = Thread.currentThread();
        System.out.println(thread.getClass().getName());

        System.out.println(thread);
        printThreadState(thread);

        thread.setName("MainGuy");
        thread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(thread);
        System.out.println("exiting main thread... ");

        CustomThread customThread = new CustomThread();
        //customThread.run();
        customThread.start();

        Runnable myRunnable = () -> {
          for (int i = 1; i<=8; i++) {
              System.out.print(" 2 ");
              try {
                  TimeUnit.MILLISECONDS.sleep(250);
              }catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        for (int i = 1; i<=3 ; i++) {
            System.out.print(" 0 ");
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e) {

            }
        }
    }

    public static void printThreadState(Thread thread) {
        System.out.println("-------------------------");
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.isAlive());
        System.out.println("---------------------------");
    }
}
