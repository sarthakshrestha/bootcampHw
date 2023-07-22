package Shapes;

public class Circle extends Shape {
    double radius;

    // No arg constructor
    Circle(){
        radius = 1.0;
    }

    // Arg constructor or setter
    public Circle(double radius){
        this.radius = radius;
    }

    // Getter for Circle
    double getRadius(){
        return radius;
    }

}

