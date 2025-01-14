import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the string and start and end indices
        System.out.print("Enter a string: ");
        String str = input.next();

        System.out.print("Enter the start index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = input.nextInt();

        // Create substrings using charAt() method and the built-in substring() method
        String substringCharAt = createSubstringUsingCharAt(str, startIndex, endIndex);
        String substringBuiltIn = str.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean result = compareStrings(substringCharAt, substringBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);
        System.out.println("Are the two substrings equal? " + result);

        input.close();
    }

    // Method to create a substring using the charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();

             for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }

        return substring.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
