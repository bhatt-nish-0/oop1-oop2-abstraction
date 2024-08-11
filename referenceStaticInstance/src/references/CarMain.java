package references;

public class CarMain {
    public static void main(String[] args) {

        Car c = new Car();
        c.setName("name1");

        Car c2 = c;

        System.out.println(c.getName());
        System.out.println(c2.getName());

        //two references are pointing to the same object/instance

        changeCar(c2);

        System.out.println(c.getName());
        System.out.println(c2.getName());


        // a reference to a totally new object
        Car c3 = new Car();
        c3.setName("name3");

        System.out.println(c3.getName());

        System.out.println(c); //same object
        System.out.println(c2); //same object
        System.out.println(c3); // different object

        new Car();

        //the above is immediately eligible for garbage collection. because you cant communicate with it
        // after that object is created.
    }

    private static void changeCar(Car c) {

        c.setName("name2");

    }
}
