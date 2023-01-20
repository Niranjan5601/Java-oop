package Interface;

public class Car implements  Brake,Engine{


    @Override
    public void start() {
        System.out.println( "Start method called");
    }

    @Override
    public void stop() {
        System.out.println("Stop method called");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate method called");

    }

    @Override
    public void brake() {
        System.out.println("Brake method called");

    }
}
