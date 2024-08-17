public interface Flyable {

    default void doSomething() {
        System.out.println("doing");
        this.doing();
    }

    private void doing() {
        System.out.println("doing!dodoing");
    }

    public static void doing2() {

        System.out.println("doing something statiuc");
    }
}
