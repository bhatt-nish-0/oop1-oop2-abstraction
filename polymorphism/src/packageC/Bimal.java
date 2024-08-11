package packageC;

public class Bimal {

    private int age;

    public Bimal(int age) {
        this.age = age;
    }

    public void doing() {
        System.out.println("doing " + age);
    }

    @Override
    public String toString() {
        return "Bimal{" +
                "age=" + age +
                '}';
    }
}
