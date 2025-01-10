import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sum = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("The number " + number + " is an Abundant Number.");
        } else {
            System.out.println("The number " + number + " is Not an Abundant Number.");
        }

        input.close();
    }
}