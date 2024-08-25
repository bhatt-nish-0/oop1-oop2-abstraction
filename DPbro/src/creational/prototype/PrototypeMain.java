package creational.prototype;

class Car implements Prototype {
    private String brand;
    private String model;
    private String color;
    private int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;

    }

    public Car( Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.topSpeed  = car.topSpeed;

    }

    @Override
    public Car clone() {
        return new Car(this);
    }


    public String describeCar() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}

interface Prototype {
    Car clone();
}

public class PrototypeMain {
    public static void main(String[] args) {
        Car c = new Car("brand","model","color",23);
        Car clone = c.clone();

        System.out.println(c);
        System.out.println(clone);

        System.out.println(c.describeCar());
        System.out.println(clone.describeCar());


    }


}
