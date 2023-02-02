package MultithreadingDemo;

//public class JoinMethod extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println("Hola thread");
//            try {
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e){
//
//            }
//        }
//    }
//}
//class JoinImplementation{
//    public static void main(String[] args) throws  InterruptedException {
//        JoinMethod t = new JoinMethod();
//        t.start();
//        //t.join(10000);
//        t.join();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello thread");
//        }
//    }
//}




//how to make child thread join the main thread

public class JoinMethod extends Thread{

    static Thread mt;
    @Override
    public void run() {
        try{
            mt.join();
        }
        catch (InterruptedException e ){}

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Hola thread");
        }
    }
}



class JoinImplementation{
    public static void main(String[] args) throws  InterruptedException {
        JoinMethod.mt = Thread.currentThread();
        JoinMethod t = new JoinMethod();
        t.start();
        //t.join(10000);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello thread");
            Thread.sleep(1000);
        }
    }
}

