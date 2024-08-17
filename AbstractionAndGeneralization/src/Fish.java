public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {


        if (speed.equals("slow")){
            System.out.println("lazily swimming");
        }else {
            System.out.println("darting");
        }
    }

    @Override
    public void makeNoise() {

        if (type.equals("goldfish")){
            System.out.println("swish");
        }else {
            System.out.println("splash");
        }
    }
}
