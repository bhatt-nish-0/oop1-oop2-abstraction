package interfaces;

public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println("truck tracking");
    }
}
