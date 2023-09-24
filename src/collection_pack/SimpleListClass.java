package collection_pack;

import java.util.ArrayList;
import java.util.List;

public class SimpleListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove("4");
        System.out.println(list);
    }
}
