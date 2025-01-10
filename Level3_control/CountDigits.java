import java.util.Scanner; // Import Scanner for user input

public class CountDigits {
    public static void main(String[] args) {
	
	    // Create Sc object to read input
        Scanner sc = new Scanner(System.in);

        //taking input from user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers by converting them to positive using Math.abs
        number = Math.abs(number);

        int count = 0;

        // Special case: If the number is 0, it has exactly one digit
        if (number == 0) {
            count = 1;
        } else {
            // Use a while loop to count the digits
            while (number != 0) {
                number = number / 10; // Remove the last digit by dividing the number by 10
                count++;              // Increment the digit count
            }
        }

        // Display the total number of digits in the input
        System.out.println("The number of digits is: " + count);

         // Close the sc object
        sc.close(); 
    }
}
