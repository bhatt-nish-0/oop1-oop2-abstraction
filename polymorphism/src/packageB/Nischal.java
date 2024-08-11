package packageB;

public class Nischal {

    public Nischal(int age) {
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doSomethingWithAge() {
        System.out.println("age is " + this.age);
    }
}
