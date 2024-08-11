package references;

public class Bus {
    private static int a;

    private int b;
    public Bus(int a){
        Bus.a = a;
    }

    public void printAstatic() {
        System.out.println("static variable a is " + a);
        //instance methods can access static variables.
    }

    public static void printAstatic2() {
        System.out.println(a);
        //System.out.println(b);
        //static methods cannot access instance variables.
    }

}
