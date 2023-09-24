package thread_pack;

public class ThreadMainClass {
    public static void main(String[] args) throws InterruptedException {
        /*
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.threadNumber = 1;
        myThread2.threadNumber = 2;

        myThread1.sleep(3000);

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from ThreadMainClass" + i);
        }
         */
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}
