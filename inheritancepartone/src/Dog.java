public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super ("Mutt","big",50);
    }

    //compile time polymorphism - well not really
    public Dog(String type, double weight) {
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small":"large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if (type.equals("Wolf")) {
            System.out.println("woo oooooo");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        System.out.println("calling parent......");
        super.move(speed);

        //System.out.println("dogs walk, run and wag their tails!");

        if (speed.equals("slow")) {
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("woof!");
    }

    private void run() {
        System.out.print("dog running!");
    }

    private void walk() {
        System.out.print("dog walking!");
    }

    private void wagTail() {
        System.out.print("tail wagging!");
    }


}
