public class Concurrency {
    public static void main(String[] args) {
        System.out.println("process - unit of execution that has its own mem space");
        System.out.println("java console application - 1 process");
        System.out.println("each process has its own mem space  - heap");
        System.out.println("heap isnt shared between 2 applications/proceses");
        System.out.println("process - application - interchangeable");
        System.out.println("a thread - each process can have multiple threads");
        System.out.println("we have just been using a main thread");
        System.out.println("every thread created by a process shares that process' memory space");
        System.out.println("this can cause big probs");

        System.out.println("each thread has a thread stack");
        System.out.println("why multiple threads?");
        System.out.println("offload long running tasks");
        System.out.println("eg query a databse - which takes long");
        System.out.println("so we can offload this querying database to an additional thread");
        System.out.println("concurrency - doing more than 1 thing at a time");
        System.out.println("single core - switching ");
        System.out.println("this gives the illusion of multitasking");
        System.out.println("multiple threads can make incremental progress");


    }
}
