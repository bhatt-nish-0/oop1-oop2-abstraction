package template;

public class ClassTwo extends PerformOperations{
    public ClassTwo(String stepFourThing) {
        super(stepFourThing);
    }

    @Override
    public void step4() {

        System.out.println(this.stepFourThing);
        System.out.println("again and again and again !");
        for (int i =0; i<10; i++) {
            System.out.println("this is from class Two!");
        }
    }
}
