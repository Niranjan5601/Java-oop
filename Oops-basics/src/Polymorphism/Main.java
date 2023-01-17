package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        //Shapes square1 = new Square();//im square
        shape.area();
        circle.area();
        square.area();
    }
}
