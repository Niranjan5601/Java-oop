package MultithreadingDemo;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);//Runnable target
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main child runnable");
        }

    }
}
