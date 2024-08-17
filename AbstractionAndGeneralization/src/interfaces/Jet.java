package interfaces;

public class Jet implements FlightEnabled, Trackable{
    @Override
    public void takeOff() {
        System.out.println("Jet taking off");
    }

    @Override
    public void loand() {
        System.out.println("jet l;amdoing");

    }

    @Override
    public void fly() {
        System.out.println("jet flying");

    }

    @Override
    public void track() {
        System.out.println("jet tracking");

    }
}
