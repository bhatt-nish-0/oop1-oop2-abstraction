import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("wolf","big",100);
        //dog.makeNoise();
        //doAnimalStuff(dog);

        Fish fish = new Fish("goldfish","small",300);

        Horse horse = new Horse("cluyd","large",200);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(fish);
        animals.add(horse);

        for (Animal a : animals) {
            doAnimalStuff(a);

            if (a instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
