public class SumOfDigits {
    public static void main(String[] args) {
        int num = 2424221;
        int sum = numOfDigits(num);
        System.out.println(sum);
    }

    private static int numOfDigits(int num) {

        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;

    }
}
