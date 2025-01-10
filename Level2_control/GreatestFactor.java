import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive number or not
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Initialize the greatest factor
            int greatestFactor = 1;

            // Loop to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Getting out of the loop once the greatest factor is found
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        input.close();
    }
}
