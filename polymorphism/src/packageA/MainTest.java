package packageA;

import packageB.Nischal;
import packageC.*;

public class MainTest {
    public static void main(String[] args) {
        Nischal n = new Nischal(98);
        n.doSomethingWithAge();

        packageB.Prayag p = new packageB.Prayag(9);
        p.doSomething();

        Bimal b = new Bimal(67);
        b.doing();
        System.out.println(b);

    }
}
