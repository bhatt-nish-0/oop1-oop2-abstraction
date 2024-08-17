import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("1","2","3","100","67","79");

        test.parallelStream().forEach(System.out::println);
        System.out.println("--------------");
        test.stream().forEach(System.out::println);
    }
}
