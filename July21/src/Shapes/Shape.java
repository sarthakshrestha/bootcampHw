package Shapes;

public class Shape {
    String color;
    Boolean filled;

    String filledString;

    // Constructor with no argument
    Shape(){
        color="Green";
        filled=true;
    }

    // Constructor with initialization
    Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Creating a setter for color
    void setColor(String color){
        this.color = color;
    }

    // Creating a setter for filled or not
    void setFilled(Boolean filled){
        this.filled = filled;
    }

    // Creating a getter
    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public String toString(){
        if(filled){
            filledString = "filled";
        }
        else {
            filledString = "is not filled";
        }
        return "A shape with color of " + color + " is " + filledString + " \n";
    }
}