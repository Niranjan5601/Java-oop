package MultithreadingDemo;

public class InterruptMethod extends Thread{

//    @Override
//    public void run() {
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("lazy ");
//                Thread.sleep(2000);
//            }
//
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }
//    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("lazy");
        }
        System.out.println("Want sleep");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}

class InterruptedDemo{
    public static void main(String[] args) {
        InterruptMethod t = new InterruptMethod();
        t.start();
        t.interrupt();
        System.out.println("End main");
    }

}