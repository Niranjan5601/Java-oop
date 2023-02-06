package MultithreadingDemo;

public class NotifyDemo extends  Thread {

int total = 0;
    public void run() {
        synchronized (this){
            System.out.println("Child thread calculates");
            for (int i = 0; i <=100 ; i++) {
                total=total+i;
            }
            System.out.println("Notify raised ");
            this.notify();

        }
    }
}


class ThreadA {
    public static void main(String[] args) throws  InterruptedException {
        NotifyDemo t = new NotifyDemo();
        t.start();
        Thread.sleep(10000);
        synchronized (t){
            System.out.println("Main thread calls wait()");
            t.wait(10000);
            System.out.println("Got notification");
            System.out.println(t.total);
        }
    }


}