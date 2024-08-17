import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        List<Integer> newNumbers = new ArrayList<>();

        newNumbers = numbers.stream().map((x) -> x + 7).collect(Collectors.toList());

        newNumbers.forEach(System.out::println);

        //===========================================

        List<Integer> numers = new ArrayList<>();
        numers.add(3);
        numers.add(5);
        numers.add(10);

        List<Integer> numers2 = new ArrayList<>();

        for (int a : numers) {
            numers2.add(a + 7);
        }

        for (int b : numers2) {
            System.out.println(b);
        }
    }
}
