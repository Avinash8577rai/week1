import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInches = input.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInSquareInches = 0.5 * baseInches * heightInches;

        // Convert the base and height to centimeters (1 inch = 2.54 cm)
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        // Calculate the area of the triangle in square centimeters
        double areaInSquareCm = 0.5 * baseCm * heightCm;

        // Print the results
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches");
        System.out.println("The area of the triangle is " + areaInSquareCm + " square centimeters");

        // Close the scanner
        input.close();
    }
}
