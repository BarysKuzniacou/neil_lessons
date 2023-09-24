package threadvolatile_pack;

import java.util.Scanner;

public class ThreadVolatileMainClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread.stopRunning();
    }
}
