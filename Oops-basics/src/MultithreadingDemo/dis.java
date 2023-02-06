package MultithreadingDemo;

 class Display {
//    public synchronized void displayn(){
//        for (int i = 0 ; i <10 ; i++) {
//            System.out.print(i);
//            try{
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e){}
//        }
//
//    }



     public  void displayn(){
         for (int i = 0 ; i <10 ; i++) {
             System.out.print(i);
             try{
                 Thread.sleep(2000);
             }
             catch (InterruptedException e){}
         }

     }

//    public synchronized  void displayc(){
//        for (int i = 65; i < 75; i++) {
//            System.out.print((char)i);
//
//            try{
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e){}
//        }
//    }
//}

     public   void displayc(){
         for (int i = 65; i < 75; i++) {
             System.out.print((char)i);

             try{
                 Thread.sleep(2000);
             }
             catch (InterruptedException e){}
         }
     }
 }


class Mythread4 extends  Thread{
     Display d ;
     Mythread4(Display d){
         this.d = d;
     }

    @Override
    public void run() {
        d.displayn();
    }
}


class Mythread5 extends  Thread{
    Display d ;
    Mythread5(Display d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayc();
    }
}

public class dis {
    public static void main(String[] args) {
        Display d = new Display();
        Mythread4 t1  = new Mythread4(d);
        Mythread5 t2 = new Mythread5(d);
        t1.start();
        t2.start();
    }
}