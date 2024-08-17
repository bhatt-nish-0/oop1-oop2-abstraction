import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findmissing {
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,7,8,9};

        findMissing(arr);

    }

    private static void findMissing(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for(int a: arr) {
            list.add(a);
        }

        Arrays.sort(arr);

        int x = arr[arr.length  - 1];
        System.out.println(x);

        for (int i = 1; i<x; i++) {
            if (!list.contains(i)) {
                System.out.println(i + " is missing ");
            }
        }
    }
}
