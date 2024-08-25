package structural.decorator;

public class Person {
    public static void main(String[] args) {

        BasicCar basicCar = new BasicCar();
        Car passengerCar = new PassengerCar(basicCar);
        passengerCar.design();
        Car luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.design();
        // you can add functionality to an existing object!
    }
}

interface Car {
    public void design();
}

class BasicCar implements Car {

    @Override
    public void design() {
        System.out.println("basic car details");
    }
}

class Decorator implements Car {

    private Car car;

    public Decorator(Car car) {
        this.car= car;
    }

    @Override
    public void design() {
        this.car.design();
    }
}

class PassengerCar extends Decorator {

    public PassengerCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Passenger car design");
    }
}

class LuxuryCar extends Decorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        super.design();
        System.out.println("Luxury car design");
    }
}