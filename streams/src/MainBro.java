import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainBro {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // List to store processed numbers
        List<Integer> processedNumbers = new ArrayList<>();

        // Process numbers and modify the original list
        for (Integer number : numbers) {
            processedNumbers.add(number * 2);
            numbers.set(0,233); // Mutating the original list
        }

        // Print results
        System.out.println( processedNumbers);
        System.out.println(  numbers);


        //===========================================================================


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<Integer> processedNumbers2 = new ArrayList<>();

        processedNumbers2 = nums.stream().map(num -> num *= 2).collect(Collectors.toList());

        System.out.println(processedNumbers2); //creted without side effects!
        System.out.println(nums);




    }
}
