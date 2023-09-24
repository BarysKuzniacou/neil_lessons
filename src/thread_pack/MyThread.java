package thread_pack;

public class MyThread extends Thread {

    public int threadNumber;

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from MyThread " + "[" + threadNumber + "] " + i);
        }
    }
}
