package Shapes;

import Shapes.Rectangle;
import Shapes.Shape;

public class ShapeTest extends Shape {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", false);

        shape1.setColor("Red");
        shape1.isFilled();

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());

        Rectangle rec1 = new Rectangle();
        rec1.setLength(2.1);
        rec1.setWidth(1.5);
        rec1.getPerimeter();
        rec1.getArea();
        System.out.println(rec1.toString());

        Rectangle rec2 = new Rectangle(2.4, 2.1);
        rec2.getPerimeter();
        rec2.getArea();
        System.out.println(rec2.toString());

//        Square sqr = new Square();


    }
}
