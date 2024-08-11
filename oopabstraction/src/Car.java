// public here means - any class in any package can access this class.
// if there is no public - means it has package access
// meaning classes only in the same package can access the class.
// do an example of this as well.
public class Car {
    //public
    //protected - subclasses can access this member!
    //if no access modifier, means package access. - do an example of this.
    // private.

    //encapsulation - bundling of behaviour and attributes
    //encapsulation - hiding

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertible? "convertible" : "-"));
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        //assign the instance variable with the value passed as an argument.
        //this is used to differentiate the two.

        //below is the reason for encapsulation!
        //force them to go thru a controlled way of setting up the data.
        if(make == null) {
            make = "Unknown";
        }
            String lowerCaseMake = make.toLowerCase();

            switch(lowerCaseMake) {
                case "holden", "porsche", "tesla" -> this.make = make;
                default -> {
                    this.make = "Unsupported";
                }
            }
        }




    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
