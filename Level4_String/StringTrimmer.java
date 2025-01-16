import java.util.Scanner;

public class StringTrimmer {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when accessing beyond the last character
        }
        return count;
    }

    // Method to trim leading and trailing spaces from a string
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = findLength(str) - 1;

        // Find the start index of non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the end index of non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring from a string using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (findLength(str1) != findLength(str2)) {
            return false;
        }

        for (int i = 0; i < findLength(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        // Trim spaces using custom method
        int[] trimmedIndices = trimSpaces(str);
        String trimmedCustom = createSubstring(str, trimmedIndices[0], trimmedIndices[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = str.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display the results
        System.out.println("Trimmed string (custom method): \"" + trimmedCustom + "\"");
        System.out.println("Trimmed string (built-in method): \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both methods equal? " + areEqual);

        input.close();
    }
}
