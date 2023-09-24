package generics_pack;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
    public static void main(String[] args) {

        AnimalClass ac = new AnimalClass();
        List annimals = new ArrayList();
        annimals.add("Cat");
        annimals.add("Dog");
        annimals.add("Cow");
        annimals.add(ac);

        System.out.println(annimals);

        String s;
        s = (String) annimals.get(1);

        System.out.println(s);

        List<String> annimals2 = new ArrayList<>();

        annimals2.add("Cat");
        annimals2.add("Dog");
        annimals2.add("Cow");

        AnimalClass ac2 = new AnimalClass();

        annimals2.add(ac2.toString());

        String s1 = annimals2.get(2);

        System.out.println(annimals2);
    }

}
