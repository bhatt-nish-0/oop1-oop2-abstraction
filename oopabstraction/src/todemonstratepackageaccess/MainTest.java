package todemonstratepackageaccess;

import outsidepackage.Taxi;

public class MainTest {
    public static void main(String[] args) {
        Train t = new Train(); // can access within the same package.
        t.anotherVar = 3; // same package, so can access.

        //t.something;
        System.out.println(t.getAnotherVar());

        Taxi t1 = new Taxi();
        // for the above, notice an import statement is neeeded.
    }
}
