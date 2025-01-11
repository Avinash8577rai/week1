import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum += i; // Add each number to sum
        }
        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Call the method to calculate the sum
            int result = calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }
		input.close();
    }
}
