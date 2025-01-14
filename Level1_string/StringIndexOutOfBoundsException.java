import java.util.Scanner;

public class StringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        generateStringIndexOutOfBoundsException(text);

        // Call the method to handle the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text);
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        try {
            // Attempt to access an index beyond the length of the string
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException generated. Message: " + e.toString());
        }
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            int index = 100; // Index beyond the length of the string
            if (index >= text.length()) {
                throw new java.lang.StringIndexOutOfBoundsException();
            }
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught and handled. Message: Index is out of bounds for the given string.");
        }
    }
}
