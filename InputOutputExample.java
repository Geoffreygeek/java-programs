import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for A and D
        System.out.print("Enter the value for A: ");
        double A = scanner.nextDouble(); // Input for A

        System.out.print("Enter the value for D: ");
        double D = scanner.nextDouble(); // Input for D

        // Calculate C = A + D
        double C = A + D;

        // Output the value of C
        System.out.println("The value of C (A + D) is: " + C);

        // Close the scanner(not must)
        scanner.close();

    }
}

