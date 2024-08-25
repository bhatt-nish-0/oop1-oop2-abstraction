package template;

public class Main {
    public static void main(String[] args) {
        PerformOperations one = new ClassOne("class one is doing something!");
        PerformOperations two = new ClassTwo("class two is doing something!");

        one.doOps();
        System.out.println();
        System.out.println();
        two.doOps();
    }
}
