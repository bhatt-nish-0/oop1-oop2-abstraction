import java.util.function.Function;

public class functionexample {
    public static void main(String[] args) {
        Function<Integer,Integer> fun = x -> x + 88;

        doSoimethng(fun);
    }

    private static void doSoimethng(Function<Integer, Integer> fun) {
        int x = fun.apply(92);
        System.out.println(x);
    }
}
