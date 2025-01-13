import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
		
        // Get the first number from the user
        double num1 = getInput("Enter the first number: ");
        
        // Get the second number from the user
        double num2 = getInput("Enter the second number: ");
        
        // Display operation choices to the user
        int choice = getOperationChoice();

        // Perform the operation
        double result = 0;
        switch (choice) {
            case 1: 
                result = add(num1, num2);
                break;
            case 2: 
                result = subtract(num1, num2);
                break;
            case 3: 
                result = multiply(num1, num2);
                break;
            case 4: 
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        // Display the result
        displayResult(result);
    }

    // Function to take input from the user
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Function to display the operation choices
    public static int getOperationChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
    }

    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 in case of division by zero
        }
        return a / b;
    }

    // Function to display the result
    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }
}
