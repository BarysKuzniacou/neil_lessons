package fileread_pack;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\data\\neil_lessons\\file.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
        }

        scanner.close();
    }
}
