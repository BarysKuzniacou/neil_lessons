package serialization_pack_2;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectArr {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Tom"),
                new Person(2, "Bob"), new Person(3, "Jack"),
                new Person(4, "John")};

        try {
            FileOutputStream fos = new FileOutputStream("people_arr.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            /*
            oos.writeInt(people.length);
            for (Person person : people) {
                oos.writeObject(person);
            }
             */
            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
