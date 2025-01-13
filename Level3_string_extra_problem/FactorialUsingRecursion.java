import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
		
        // Take input from the user
        int number = getInput("Enter a number to calculate its factorial: ");

        // Calculate the factorial using recursion
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
