package MultithreadingDemo;

public class SleepImplementation {
    public static void main(String[] args)throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello "+ i);
            Thread.sleep(5000);
        }
    }
}
