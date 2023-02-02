package MultithreadingDemo;

public class PriorityExample extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
        }
    }
}

class Test{

    public static void main(String[] args) {

        //Thread.currentThread().setPriority(15);
        //Thread.currentThread().setPriority(10);
        PriorityExample t = new PriorityExample();

        t.setPriority(10);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }


    }

}
