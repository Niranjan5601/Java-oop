package MultithreadingDemo;

public class SyncExecution {
    public static void main(String[] args) {
        Method d = new Method();
        MyThread2 t = new MyThread2(d,"ninja");
        MyThread2 t2 = new MyThread2(d,"Bello");
        MyThread2 t3 = new MyThread2(d,"jnjaksnd");
        MyThread2 t4 = new MyThread2(d,"qiowjiojio");
        MyThread2 t5 = new MyThread2(d,"mmkkn");
        MyThread2 t6 = new MyThread2(d,"iojo");
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}



class Method{
//   public void wish(String name){
//        for (int i = 0; i <10 ; i++) {
//            System.out.print("Hello");
//            try {
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e){}
//            System.out.println(name);
//
//
//        }
//
//    }


   //with synchronized
    public synchronized void wish(String name){
        for (int i = 0; i <10 ; i++) {
            System.out.print("Hello");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println(name);


        }

    }
}

class MyThread2 extends Thread{
    Method d;
    String name;

    MyThread2(Method d , String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

