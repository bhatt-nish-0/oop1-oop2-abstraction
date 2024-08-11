public class AnotherLookAtString {
    public static void main(String[] args) {

        String x = "hello world";
        char c = x.charAt(0);

        System.out.println(c);

        String replace = x.replace('o', 'b');
        x = null;
        System.out.println(x);
        System.out.println(replace);
        //string is immutable.

        //when you call string.replace, a new instance of string is created and a reference to that
        // new instance is returned.

        String r = "hello";
        String test = r.concat("test");
        System.out.println(r);
        System.out.println(test);

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append("test123");

        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        stringBuilder.append("=================================================================");
        System.out.println(stringBuilder.capacity());

    }
}
