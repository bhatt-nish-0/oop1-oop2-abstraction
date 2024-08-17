public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {6,1,4,9,0,2,13};
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println("-----------------------");
        selectionSort(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
