import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");
        System.out.println("Provide feedback: Enter 'h' if my guess is too high, 'l' if it's too low, and 'c' if it's correct.");

        // Initialize the range
        int low = 1;
        int high = 100;
        boolean correctGuess = false;

        while (!correctGuess) {
            // Generate the next guess
            int guess = generateGuess(low, high);

            // Display the guess and get feedback
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter your feedback (h/l/c): ");
            char feedback = scanner.next().charAt(0);

            // Process feedback
            switch (feedback) {
                case 'h': // Guess is too high
                    high = guess - 1;
                    break;
                case 'l': // Guess is too low
                    low = guess + 1;
                    break;
                case 'c': // Guess is correct
                    correctGuess = true;
                    System.out.println("Hooray! I guessed your number!");
                    break;
                default:
                    System.out.println("Invalid feedback. Please enter 'h', 'l', or 'c'.");
            }

            // Check if the range is invalid
            if (low > high) {
                System.out.println("Something went wrong. Did you change your number?");
                break;
            }
        }

        scanner.close();
    }

    // Method to generate a random guess within the range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
}
