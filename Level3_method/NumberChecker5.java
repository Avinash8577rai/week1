public class NumberChecker5 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 25; // Example input, you can replace this with any number to test

        System.out.println("Number: " + number);

        // Check if the number is prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is Neon: " + isNeon(number));

        // Check if the number is a spy number
        System.out.println("Is Spy: " + isSpy(number));

        // Check if the number is an automorphic number
        System.out.println("Is Automorphic: " + isAutomorphic(number));

        // Check if the number is a buzz number
        System.out.println("Is Buzz: " + isBuzz(number));
    }
}
