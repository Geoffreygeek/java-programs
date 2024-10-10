import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principle");
        double principle = scanner.nextDouble();

        System.out.println("Enter the rate");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time (yearly)");
        double time = scanner.nextDouble();

        double interest = principle * rate/100 * time;

        System.out.println("Your simple interest is : " + interest);


    }
}