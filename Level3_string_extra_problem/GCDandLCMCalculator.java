import java.util.Scanner;

public class GCDandLCMCalculator {
    public static void main(String[] args) {
		
        // Take input from the user for two numbers
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        // Calculate the GCD and LCM of the two numbers
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResults(gcd, lcm);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // Use Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = |a * b| / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }

    // Function to display the GCD and LCM
    public static void displayResults(int gcd, int lcm) {
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
}
