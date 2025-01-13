import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
		
		
        // Get user input
        String input = getInput("Enter a string to check if it is a palindrome: ");

        // Check if the input is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        displayResult(input, isPalindrome);
    }

    // Function to take user input
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
		
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check if the string reads the same forward and backward
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }

        return true; 
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
