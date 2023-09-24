package wildcard_pack;

import java.util.ArrayList;
import java.util.List;

public class WildCardClass {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cow"));
        animals.add(new Animal("Bear"));
        animals.add(new Animal("Racoon"));
        printListOfAnimals(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        printListOfAnimals(dogs);

        eating(animals);
        eating(dogs);
    }

    private static void printListOfAnimals(List<? extends Animal> list) {
        for (Animal oneOfanimal : list) {
            System.out.println(oneOfanimal);
        }
    }

    private static void eating(List<? extends /*super - выше Animal */ Animal> list) {
        for (Animal oneOfanimal : list) {
            oneOfanimal.eat();
        }
    }
}
