package interfaces;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainInterfaces {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal a = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        a.movie();

        flightEnabled.fly();
        flightEnabled.loand();
        flightEnabled.takeOff();

        trackable.track();

        Jet f = new Jet();


        inFlight(flightEnabled);

        inFlight(f);
        Trackable truck = new Truck();
        truck.track();

        Satellite satellite = new Satellite();
        inFlight(satellite);

        ArrayList<FlightEnabled> fliers = new ArrayList<>(0);
        fliers.add(satellite);

        doSomeFlying(fliers);
        doSomeFlying2(fliers);

        LinkedList<FlightEnabled> fliers2 = new LinkedList<>();
        fliers2.add(satellite);

        //doSomeFlying(fliers2);
        doSomeFlying2(fliers2);
    }

    private static void doSomeFlying(ArrayList<FlightEnabled> type) {
        System.out.println("inside specifi arraylist!");
        for (FlightEnabled e : type) {
            e.fly();
        }
    }

    private static void doSomeFlying2(List<FlightEnabled> type) {
        System.out.println("inside general list!");
        for (FlightEnabled e : type) {
            e.fly();
        }
    }

    private static void inFlight(FlightEnabled flightEnabled) {
        System.out.println(FlightEnabled.KM_TO_MILES);
        System.out.println(FlightEnabled.MILES_TO_KM);
        flightEnabled.takeOff();
        flightEnabled.fly();
        if (flightEnabled instanceof Trackable track) {
            System.out.println("in here");
            track.track();
        }

        if (flightEnabled instanceof OrbitEartch o) {
            System.out.println("finally................................................");
            o.achieveOrbit();
        }

        flightEnabled.loand();
    }
}
