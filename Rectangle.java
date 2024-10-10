public class Rectangle {
     double length;
     double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Accessor methods
    public double getLength() {

        return length;
    }

    public double getWidth() {
        return width;
    }

    // Mutator methods
    public void setLength(double length) {

        this.length = length;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    // Methods to compute area and perimeter
    public double computeArea() {

        return length * width;
    }

    public double computePerimeter() {

        return 2 * (length + width);
    }

    //string methods
    public String toString() {
        return "the length =" +getLength()+"ln"+
                    "the width =" +getWidth()+"ln"+
                "the area = "+computeArea();
    }
}
