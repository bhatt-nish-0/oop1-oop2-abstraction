package interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void movie() {
        System.out.println("flaps wings");
    }

    @Override
    public void takeOff() {

        System.out.println("taking off");
    }

    @Override
    public void loand() {

        System.out.println("landing");
    }

    @Override
    public void fly() {
        System.out.println("flying");

    }

    @Override
    public void track() {

        System.out.println("tracking");
    }
}
