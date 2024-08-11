public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal("General animal","huge",400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");


        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");


        Dog retriever = new Dog("Labrador", 65, "Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow");

        Fish fish = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(fish,"fast");

        Fish fish2 = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(fish2,"slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(" _ _ _ _ _ ");
        // at runtime, java will decide which is the implementation class, and call its own methods.

    }
}
