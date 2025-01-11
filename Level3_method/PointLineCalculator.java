import java.util.Scanner;

public class PointLineCalculator {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope and y-intercept of the line passing through two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2];
        if (x2 == x1) { // Vertical line, slope is undefined
            System.out.println("The line is vertical. Slope is undefined.");
            return null;
        }

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        double yIntercept = y1 - (slope * x1);

        lineEquation[0] = slope;      // Slope (m)
        lineEquation[1] = yIntercept; // Y-intercept (b)
        return lineEquation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f\n", distance);

        // Calculate and display line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        }
    }
}
