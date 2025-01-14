import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = input.next();

        System.out.print("Enter the second string: ");
        String str2 = input.next();

        // Compare strings using charAt() method
        boolean resultCharAt = compareStringsUsingCharAt(str1, str2);

        // Compare strings using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Check if both methods give the same result
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("The methods returned different results.");
        }

        input.close();
    }

    // Method to compare two strings using charAt()

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If the lengths are different, the strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the strings using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;             }
        }

        return true;    }
}
