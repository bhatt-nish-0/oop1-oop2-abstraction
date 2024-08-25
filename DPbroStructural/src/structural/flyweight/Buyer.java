package structural.flyweight;

import java.util.HashMap;

public class Buyer {
    public static void main(String[] args) {

        Vehicle v = VehicleFactory.getVehicle("cycle");
        v.assignColor("red");
        v.startEngine();

        Vehicle v1 = VehicleFactory.getVehicle("cycle");
        v.assignColor("black");
        v.startEngine();

        System.out.println(v == v1);


    }
}

interface Vehicle {
    public void assignColor(String color);
    public void startEngine();
}

class Truck implements Vehicle {

    private final String MAXSPEED;
    private String color;

    Truck() {
        MAXSPEED = "120 km/h";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {

        System.out.println(color + " truck with max speed is " + MAXSPEED);
    }
}

class Cycle implements Vehicle {

    private final String MAXSPEED;
    private String color;

    Cycle() {
        MAXSPEED = "15 km/h";
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {

        System.out.println(color + " cycle with max speed is " + MAXSPEED);
    }
}

class VehicleFactory {
    private static HashMap<String,Vehicle> hashMap = new HashMap<>();

    public static Vehicle getVehicle(String type) {
        Vehicle v = null;
        if (hashMap.containsKey(type)) {
            v = hashMap.get(type);
        }else {
            if (type.equals("truck")) {
                v = new Truck();
            } else {
                v = new Cycle();
            }
            hashMap.put(type,v);
        }

        return v;
    }
}

