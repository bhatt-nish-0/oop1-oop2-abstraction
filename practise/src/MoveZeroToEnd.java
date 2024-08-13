public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,0,2,0,1,4,2};
        changeArr(arr);

        printarr(arr);
    }

    private static void printarr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }

    private static void changeArr(int[] arr) {

        int b[] = new int[arr.length];
        int index = 0;
        for (int i =0; i<arr.length; i++) {
            if (arr[i] != 0) {
                b[index] = arr[i];
                index++;
            }
        }

        for (int i =0; i<b.length; i++) {
            arr[i] = b[i];
        }

    }
}
