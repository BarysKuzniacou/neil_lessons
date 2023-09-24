package thread_pack;

public class Runner implements Runnable{
    public int threadNumber;
    @Override
    public void run() {


            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from MyThread " + "[" + threadNumber + "] " + i);
            }
    }
}
