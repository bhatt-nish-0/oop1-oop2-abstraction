package interfaces;

import javax.sound.midi.Track;

interface FlightEnabled {
    public static final double MILES_TO_KM = 1.60934;
    public static final double KM_TO_MILES = 0.621371;

    void takeOff();
    void loand();
    void fly();
}

interface Trackable {

    void track();

}

public abstract class Animal {

    public abstract void movie();
}

class Satellite implements OrbitEartch {

    public void achieveOrbit() {
        System.out.println("orbit was ahieved");
    }

    @Override
    public void takeOff() {
        System.out.println("satellite take off");
    }

    @Override
    public void loand() {

        System.out.println("satellite landing");
    }

    @Override
    public void fly() {
        System.out.println("satellite landing");

    }
}

interface OrbitEartch extends FlightEnabled /*, Trackable*/ {

    void achieveOrbit();

}
