package MultithreadingDemo;

public class ThreadDemo {
        public static void main(String[] args) {
            Mythread t = new Mythread();
            t.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("main thread");

        }
            System.out.println(t.getName());// returns the name of the thread
    }
}
