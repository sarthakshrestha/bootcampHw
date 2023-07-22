package Shapes;

public class Rectangle extends Shape {
    static double length;
    double width;

    //no arg constructor
    Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    Rectangle(double length, double width){
        Rectangle.length = length;
        this.width = width;
    }

    //setters
    public void setLength(double length){
        Rectangle.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    //getters
    double getLength(){
        return length;
    }

    double getWidth(){
        return width;
    }

    // Area method
    void getArea(){
        double area = length*width;
        System.out.println("The area of the rectangle is " + area + "\n");
    }

    // Perimeter method
    double getPerimeter(){
        System.out.println("The perimeter is " +  (2*length + 2*width) + "\n");
        return (2*length + 2*width);
    }

    @Override
    public String toString(){
        String superClass = getClass().getSuperclass().getSimpleName();
        return "A rectangle with width = " + width + " and length =  " + length +
                " which is a subclass of " + superClass + "\n";
    }
}
