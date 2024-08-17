import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class parallelization {
    public static void main(String[] args) {

        int numberOfCores = Runtime.getRuntime().availableProcessors();

        // Print the number of cores
        System.out.println("Number of available cores: " + numberOfCores);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            integerList.add(i);
        }

        long startTime;
        long endTime;

        // Timing parallel stream
        startTime = System.nanoTime(); // More precise timing
        long parallelSum = integerList.parallelStream()
                .mapToLong(i -> (long) i * i) // Compute square of each number
                .sum(); // Sum all squared values
        endTime = System.nanoTime();
        System.out.println("Parallel Stream Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Parallel Stream Sum: " + parallelSum);

        // Timing sequential stream
        startTime = System.nanoTime(); // More precise timing
        long sequentialSum = integerList.stream()
                .mapToLong(i -> (long) i * i) // Compute square of each number
                .sum(); // Sum all squared values
        endTime = System.nanoTime();
        System.out.println("Sequential Stream Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Sequential Stream Sum: " + sequentialSum);

    }
}
