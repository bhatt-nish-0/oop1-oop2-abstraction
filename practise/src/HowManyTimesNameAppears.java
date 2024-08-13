public class HowManyTimesNameAppears {
    public static void main(String[] args) {
        String x = "aaaaxobbbbbxoxoxocccc";
        String name = "xo";
        System.out.println(countNames(x,name));

    }

    private static int countNames(String x, String name) {
        int len = name.length();
        int index = 0;
        for (int i =0; i<x.length()-len; i++) {
            int temp = i;
            if (x.substring(temp, temp += name.length() ).equals(name)){
                index++;
            }
        }

        return index;
    }
}
