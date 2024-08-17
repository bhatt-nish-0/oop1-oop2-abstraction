public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.doSomething();

        System.out.println("-------------");
        Plane p = new Plane();
        p.doSomething();

        Flyable.doing2();
    }
}

class Bird implements Flyable {

}

class Plane implements Flyable {

    public void doSomething() {
        System.out.println("doing specific!");
    }

}

class Helicopter implements Flyable {

}
