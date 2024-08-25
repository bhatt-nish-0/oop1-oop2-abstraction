package template;

public class ClassOne extends PerformOperations{
    public ClassOne(String stepFourThing) {
        super(stepFourThing);
    }

    @Override
    public void step4() {
        System.out.println(this.stepFourThing);
        for (int i =0; i<3 ; i++){
            System.out.println("class one la bro!");
        }
    }
}
