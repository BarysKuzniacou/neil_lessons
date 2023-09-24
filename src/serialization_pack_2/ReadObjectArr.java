package serialization_pack_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectArr {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("people_arr.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            /*
            int peoleCount = ois.readInt();
            Person[] people = new Person[peoleCount];

            for (int i = 0; i < peoleCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            */

            Person[] peolpe = (Person[]) ois.readObject();

            ois.close();

            System.out.println(Arrays.toString(peolpe));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
