package extends_pack;

public class ExtendsMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.eat();
        animal2.eat();

        System.out.println("Animal");
        animal.showInfo();
        System.out.println("Dog");
        dog.showInfo();
        System.out.println("Cat");
        cat.showInfo();

        ShowInfo showInfo1 = new Animal();
        ShowInfo showInfo2 = new Dog();
        ShowInfo showInfo3 = new Cat();

        System.out.println("Animal");
        showInfo1.showInfo();
        System.out.println("Dog");
        showInfo2.showInfo();
        System.out.println("Cat");
        showInfo3.showInfo();

        showInfoFunc(showInfo1);
        showInfoFunc(showInfo2);
        showInfoFunc(showInfo3);

        showInfoFunc(animal);
        showInfoFunc(dog);
        showInfoFunc(cat);

        Dog dog3 = new Dog();
        Animal animal3 = dog3;

        animal3.eat();
        animal3.showInfo();

        Cat cat4 = new Cat();
        Animal animal4 = cat4;
        Cat cat4_1 = (Cat) animal4;


        cat4_1.eat();
        cat4_1.meow();
        cat4_1.showInfo();

        /*Animal animal5 = new Animal();
        Dog dog5 = (Dog) animal5;

        //dog5.eat();
        //dog5.showInfo();
        //dog5.bark();*/

    }

    public static void showInfoFunc(ShowInfo info) {
        info.showInfo();
    }
}
