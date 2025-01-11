import java.util.ArrayList;

public class NumberChecker {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of a number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example input

        System.out.println("Number: " + number);

        // Count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + java.util.Arrays.toString(digits));

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
