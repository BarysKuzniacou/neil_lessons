package extends_pack;

public class Animal implements ShowInfo {

    String name = "NAME";
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void showInfo() {
        System.out.println(name);
    }
}
