package template;

public abstract class PerformOperations {

    protected final String stepFourThing;

    public PerformOperations(String stepFourThing) {
        this.stepFourThing = stepFourThing;
    }

    public void doOps() {
        step1();
        step2();
        step3();
        step4();
        System.out.println("finished!");
    }

    public void step3() {
        System.out.println("doing step 3");
    }

    public void step2() {
        System.out.println("doing step 2");
    }

    public void step1() {
        System.out.println("doing step 1");
    }

    public abstract void step4();
}
