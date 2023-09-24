package wildcard_pack;

public class Animal {
    String animalName;

    public void eat() {
        System.out.printf("Animal %s is eating", this.animalName);
    }

    public Animal() {

    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
