package structural.bridge;

public class User {
    public static void main(String[] args) {

        Automobile bus = new Bus(new Produce(), new Assemble());
        Automobile taxi = new Taxi(new Produce(), new Assemble());

        bus.manufacture();
        taxi.manufacture();
    }
}

interface WorkShop {
    abstract public void work();
}

class Assemble implements WorkShop {

    @Override
    public void work() {
        System.out.println("and assembled");
    }
}

class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.println("produced");
    }
}

abstract class Automobile {
    protected WorkShop workShop1;
    protected WorkShop workshop2;

    protected Automobile(WorkShop ws1, WorkShop ws2) {
        this.workShop1 = ws1;
        this.workshop2 = ws2;
    }

    abstract public void manufacture();

}

class Bus extends Automobile {

    public Bus(WorkShop ws1, WorkShop ws2) {
        super(ws1,ws2);
    }

    @Override
    public void manufacture() {
        System.out.println("bus is ");
        workShop1.work();
        workshop2.work();
    }
}

class Taxi extends Automobile {

    public Taxi(WorkShop ws1, WorkShop ws2) {
        super(ws1,ws2);
    }

    @Override
    public void manufacture() {
        System.out.println("taxi is ");
        workShop1.work();
        workshop2.work();
    }
}
