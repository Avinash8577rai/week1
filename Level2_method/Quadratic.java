import java.util.Scanner;

public class Quadratic {

    // Method to find roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c); // Calculate discriminant (delta)

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta < 0)
            return new double[0]; // Empty array for no real roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Validate input
        if (a == 0) {
            System.out.println("This is not a quadratic equation. Coefficient 'a' must not be 0.");
        } else {
            // Find roots
            double[] roots = findRoots(a, b, c);

            // Display results
            if (roots.length == 2) {
                System.out.printf("The roots of the quadratic equation are: %.2f and %.2f%n", roots[0], roots[1]);
            } else if (roots.length == 1) {
                System.out.printf("The root of the quadratic equation is: %.2f%n", roots[0]);
            } else {
                System.out.println("The quadratic equation has no real roots.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
