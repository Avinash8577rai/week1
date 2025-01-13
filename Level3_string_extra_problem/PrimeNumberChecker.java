import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
		
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean checkPrime(int number) {
        // Numbers less than 2 are not prime
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true;
    }
}
