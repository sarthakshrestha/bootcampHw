package Shapes;

public class Square extends Rectangle {
    double length;

    Square(){
        length = 4.3;
    }

    Square(double length){
        this.length = length;
        super.setLength(length);{
        }
    }

    // Setting the side
    void setSide(double length){
        this.length = length;
    }

    // Getting the side
    double getSide(){
        return length;
    }

    @Override
    double getLength(){
        return length;
    }

    @Override
    void getArea(){
        System.out.println("The area of the square is: " + length*length);
    }

    void getSquareArea(){
        System.out.println("The area of the square is: " + Rectangle.length*Rectangle.length);
    }

    @Override
    public String toString(){
        String superClass = getClass().getSuperclass().getSimpleName();
        return "A square with side " + length + "is a subclass of " + superClass;
    }
}
