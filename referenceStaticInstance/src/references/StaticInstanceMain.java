package references;

public class StaticInstanceMain {
    public static void main(String[] args) {

        Bus b = new Bus(4);
        Bus c = new Bus(8);
        b.printAstatic();
        c.printAstatic();

        Bus.printAstatic2();
        Bus.printAstatic2();

        //-------------------------------

        Taxi d = new Taxi(9);
        Taxi e = new Taxi(10);
        d.printA();
        e.printA();
    }
}
