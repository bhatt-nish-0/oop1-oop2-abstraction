public class HumanMain {
    public static void main(String[] args) {

        Human h2 = new Human();
        System.out.println(h2.talkAlotOrLittle().getClass());

        Human h = new Girl();
        System.out.println(h.talkAlotOrLittle().getClass()); //overriding

        h = new Boy();
        System.out.println(h.talkAlotOrLittle().getClass());

        Boy b1 = new Boy();
        System.out.println(b1.getSomething());
        System.out.println(b1.getSomething(3)); //overloading.
    }
}
