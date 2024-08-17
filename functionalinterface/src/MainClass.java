public class MainClass {
    public static void main(String[] args) {

        int sum = 0;
        long l = System.currentTimeMillis();
        long l2 = System.currentTimeMillis();
        for (int i =0; i<30000; i++) {

            sum = operate((a, b) -> a + b, 1, 2);
            System.out.println(sum);
            sum = operate((a, b) -> a * b, 1, 2);
            System.out.println(sum);
            sum = operate((a, b) -> a - b, 1, 2);
            System.out.println(sum);
        }
        l2 = System.currentTimeMillis();
        System.out.println("currentimemillis" + (l2 - l));

        l = System.currentTimeMillis();
        for (int i =0; i<30000; i++) {
            OperateInterface op = new OperateInterfaceImplMinus();
            OperateInterface op1 = new OperateInterfaceImplSum();
            OperateInterface op2 = new OperateInterfaceImplTimes();
            //System.out.println("-----------------------");
            sum = op1.operate(1, 2);
            System.out.println(sum);
            sum = op2.operate(1, 2);
            System.out.println(sum);
            sum = op.operate(1, 2);
            System.out.println(sum);

        }
            l2 = System.currentTimeMillis();
        System.out.println("currentimemillis" + (l2 - l));


    }

    private static int operate(OperateInterface operateInterface, int a, int b) {
        return operateInterface.operate(a,b);
    }

    /*
       1. expressions statements
       2. control flow
       3. oop 1 2 3
       4. generics
       5. lambda and functional interface
       6. streams
       7. concurrency

     */
}
