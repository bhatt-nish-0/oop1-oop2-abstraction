public abstract class ComputerTemplate {

    public final void doOn() {
        getParts();
        assembleParts();
        installOs();
        startComputer();

    }

    public abstract void installOs();

    public void getParts() {
        System.out.println("getting parts!");
    }

    public void assembleParts() {
        System.out.println("assembling parts!");
    }

    public void startComputer() {
        System.out.println("starting!");
    }
}
