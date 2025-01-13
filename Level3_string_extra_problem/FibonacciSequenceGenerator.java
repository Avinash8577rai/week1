import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
		
        // Take input from the user for the number of terms
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        // Call the function to print Fibonacci sequence
        generateFibonacci(numTerms);

        scanner.close();
    }

   
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        // Print the first term if n is greater than 0
        if (n > 0) {
            System.out.print("Fibonacci Sequence: " + first);
        }

        // Print the second term if n is greater than 1
        if (n > 1) {
            System.out.print(" " + second);
        }

        // Print the rest of the Fibonacci sequence
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println();  
    }
}
