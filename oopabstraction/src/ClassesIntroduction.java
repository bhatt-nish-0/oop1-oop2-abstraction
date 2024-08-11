// a class is a powerful user-defined data type.
//
public class ClassesIntroduction {
    public static void main(String[] args) {
        // model real world object as software objects which contain both data and code.

        //oop is sometimes called class based programming
        //objects have state and behaviour.
        //state - age - stored in fields
        //behaviour - movement - in methods.


        Car car = new Car(); //by default, the instance variables are either 0 or null depending on the data type.
        car.describeCar();

        car.setColor("blue");
        car.setConvertible(true);
        car.setDoors(3);
        car.setMake("porsche");
        car.setModel("Some-Model");

        System.out.println(car.getColor());
        System.out.println(car.getDoors());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.isConvertible());

        car.describeCar();

        Car car2 = null; //throw an exception at runtime
        try {
            car2.describeCar();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //Car car3;
        //car3.describeCar(); --> causing a compile time exception.






    }
}
