import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of first n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;  // Base case: sum of 0 natural numbers is 0
        }
        return n + sumUsingRecursion(n - 1);  // Recursive step
    }

    // Method to find the sum of first n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;  // Exit if the input is not a natural number
        }

        // Calculate the sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);

        // Compare the two results and print the result
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }

        sc.close();
    }
}
