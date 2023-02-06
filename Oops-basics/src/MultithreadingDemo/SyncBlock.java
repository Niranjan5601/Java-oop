package MultithreadingDemo;

public class SyncBlock {
    public static void main(String[] args) {
        Display1 d = new Display1();
        Display1 d1 = new Display1();
        Mythread8 t = new Mythread8(d,"Kumar");
        Mythread8 t1 = new Mythread8(d1,"Ninja");
        t.start();
        t1.start();
    }
}



class Display1 {


    public void wish(String name) {

//        synchronized (this) { //object level lock
//            for (int i = 0; i < 10; i++) {
//                System.out.print("GM: ");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                }
//                System.out.println(name);
//            }
//        }
        synchronized (Display1.class) {//class level lock
            for (int i = 0; i < 10; i++) {
                System.out.print("GM: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
        }

    }
}



class Mythread8 extends  Thread{
    Display1 d ;
    String name;
    Mythread8(Display1 d,String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}




