package MultithreadingDemo;

public class DaemonThread {
    public static void main(String[] args) {
      //  System.out.println(Thread.currentThread().isDaemon());

//        Thread t = new Thread();
//        System.out.println(t.isDaemon());
//        t.setDaemon(true);
//        System.out.println(t.isDaemon());

        MythreadA t = new MythreadA();
       t.setDaemon(true);
        t.start();
        System.out.println("End of main thread");


    }
}


class MythreadA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e ){}
        }

    }
}
