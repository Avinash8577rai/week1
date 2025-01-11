import java.util.Arrays;

public class NumberChecker4 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to ignore leading zeros
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1221; // Example number

        System.out.println("Number: " + number);

        // Count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reversed array
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        // Check if the arrays are equal
        boolean arraysEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are digits array and reversed array equal: " + arraysEqual);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is palindrome: " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is duck number: " + isDuck);
    }
}
