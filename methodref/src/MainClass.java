import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println("------------");
        List<String> listNew = new ArrayList<>();
        listNew = list.stream().map(MainClass::addNumber).collect(Collectors.toList());

        for (String x : listNew) {
            System.out.println(x);
        }

        System.out.println("------------");
        listNew = list.stream().map(u -> u + 10 +"").collect(Collectors.toList());

        for (String x : listNew) {
            System.out.println(x);
        }

    }

    private static String addNumber(int a) {
        return a + 10 + "";
    }
}
