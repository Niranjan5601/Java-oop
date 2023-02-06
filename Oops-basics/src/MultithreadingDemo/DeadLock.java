package MultithreadingDemo;

public class DeadLock extends  Thread{
    A a = new A();
    B b = new B();
    public  void m1(){
        this.start();
        a.d1(b);
    }


    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        DeadLock d  = new DeadLock();
        d.m1();

    }
}


class A {
    public synchronized   void d1(B b)   {
        System.out.println("Thread 1 starts execution of d1()");
        try{
            Thread.sleep(6000);
        }
        catch (InterruptedException e ){

        }

        System.out.println("Thread1 calling b's last()");

        b.last();

    }

    public synchronized void last(){
        System.out.println("Inside A,last()");
    }
}

class B{
    public synchronized   void d2(A a)   {
        System.out.println("Thread 2 starts execution of d2()");
        try{
            Thread.sleep(6000);
        }
        catch (InterruptedException e ){

        }

        System.out.println("Thread2 calling a's last()");

        a.last();

    }

    public synchronized void last(){
        System.out.println("Inside B,last()");
    }
}