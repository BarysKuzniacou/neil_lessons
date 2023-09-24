package anonymous_pack;

public class AnonymousClassMain {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();

        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog is eating");
            }
        };

        dog.eat();

        AbleToEat otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        Sleeping someone = new Sleeping() {
            public void sleep() {
                System.out.println("Sleeping");
            }
        };

        someone.sleep();
    }
}
