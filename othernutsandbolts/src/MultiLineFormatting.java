public class MultiLineFormatting {
    public static void main(String[] args) {

        String text = """
                  abc
                  def""";
        System.out.println(text);

        System.out.printf("%d is great\n", 10);
        int age = 23;
        System.out.printf("%d is great but %d is better\n",age,10);

        System.out.printf("%.2f",10.0);
    }
}
