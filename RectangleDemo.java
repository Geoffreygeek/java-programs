import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create a Rectangle object using the parameterized constructor to initialize
        Rectangle rectangle1= new Rectangle(length, width);
        Rectangle rectangle2=new Rectangle(20,30);

        // Compute and display the perimeter
        double perimeter = rectangle1.computePerimeter();
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        //compute and display2 the area
        double area = rectangle1.computeArea();
        System.out.println("The area of the rectangle is: " + area);
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}