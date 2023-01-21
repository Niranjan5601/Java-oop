package Exercise.Circle;

public class Circle {



    double radius ;

    Circle(double radius){
        this.radius = radius;
    }
    Circle(){
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    public double getCircumference(){
        return 2*3.14*this.radius;
    }

  @Override
    public String toString(){
        return "Class[Radius = "+this.radius+"]";
  }


}
