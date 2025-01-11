import java.util.Scanner;

public class CollinearPointsChecker {

    // Method to check if the points are collinear using the slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // If all slopes are equal, the points are collinear
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if the points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is zero, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the coordinates of the 3 points
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check if points are collinear using slope method
        boolean collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        // Check if points are collinear using area method
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display the results
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}
