package equals_pack;

public class Animal {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal animal = (Animal) obj;
        return this.id == animal.id;
    }
}
