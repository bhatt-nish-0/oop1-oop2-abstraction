public class Main {
    public static void main(String[] args) {

        Test<String > test = new Test<>();
        Test<Integer> test2 = new Test<>();

//        test.print();
//        test2.print();

        test.setField("test");
        test2.setField(23);

        test.print();
        test2.print();

        Another<String,String,String> another = new Another<>();
        Another<Integer,Integer,String> another2 = new Another<>();

        another.setField("test");
        another.setField2("test2");
        another.setField3("hibro");

        another2.setField(3);
        another2.setField2(34);
        another2.setField3("t");

        another.printStuff();
        another2.printStuff();

        Another another3 = new Another();
        another3.setField3("hello world");
        another3.setField2("hi");
        another3.setField("ddd");
        another3.printStuff();

        System.out.println(doingSomethingElse(23));
        System.out.println(doingSomethingElse("String"));


    }

    private static <T> Integer doingSomethingElse(T data) {

        int sum = 0;
        if (data instanceof Integer) {
            return (((Integer)data).intValue() + 22);
        }

        else {
            return null;
        }

    }
}

class Another <T,R,V> {
    private T field;
    private R field2;
    private V field3;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public R getField2() {
        return field2;
    }

    public void setField2(R field2) {
        this.field2 = field2;
    }

    public V getField3() {
        return field3;
    }

    public void setField3(V field3) {
        this.field3 = field3;
    }

    public void printStuff() {
        if  (field instanceof String && field2 instanceof String && field3 instanceof String) {
            System.out.println(((String) field).charAt(0));
            System.out.println(((String) field2).charAt(0));
            System.out.println(((String) field3).charAt(0));
        }else {
            System.out.println("one of them is not a string");
        }
    }
}

class Test <T> {
    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public void print() {
        if (field instanceof String) {
            System.out.println("its a string");
        }else {
            System.out.println("its an integer");
        }
    }
}
