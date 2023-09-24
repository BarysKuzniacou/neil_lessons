package extends_pack;

public class Cat extends Animal implements ShowInfo{

    private int id = 11;

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void showInfo() {
        System.out.println(id);
    }
}
