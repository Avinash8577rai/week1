import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
		
		
        // Take three numbers as input
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Find the maximum of the three numbers
        int max = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; 

        // Compare with num2
        if (num2 > max) {
            max = num2;
        }

        // Compare with num3
        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
