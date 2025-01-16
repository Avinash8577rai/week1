import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input text from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        
        // Logic 1: Using start and end indexes
        boolean result1 = isPalindromeByIndex(text);
        System.out.println("Palindrome check using index comparison: " + result1);
        
        // Logic 2: Using recursion
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check using recursion: " + result2);
        
        // Logic 3: Using character arrays
        boolean result3 = isPalindromeUsingArrays(text);
        System.out.println("Palindrome check using character arrays: " + result3);
        
        sc.close();
    }

    // Logic 1: Compare characters from start and end using indexes
    public static boolean isPalindromeByIndex(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to compare characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingArrays(String text) {
        // Convert string to character array
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];
        
        // Reverse the character array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }
        
        // Compare the original and reverse arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }
}
