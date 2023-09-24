package serialization_pack_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject2 {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Tom");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
