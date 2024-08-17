import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("nishabcd");
        strings.add("b234");
        strings.add("nish123");
        List<String> newStrings = new ArrayList<>();

        newStrings = strings.stream().filter(x -> x.length() > 7).collect(Collectors.toList());
        newStrings.stream().forEach(System.out::println);
        //=========================

        List<String> string1 = new ArrayList<>();
        string1.add("nishabcd");
        string1.add("b234");
        string1.add("nish123");
        List<String> string2 = new ArrayList<>();
        for (String x : string1) {
            if (x.length() > 7) {
                string2.add(x);
            }
        }

        for (String x: string2) {
            System.out.println(x);
        }
    }
}
