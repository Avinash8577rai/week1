import java.util.Scanner;

public class StringLength {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access the character at index `count`
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when accessing beyond the last character
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String str = input.next();

        // Find length using the custom method
        int customLength = findLength(str);

        // Find length using the built-in length() method
        int builtInLength = str.length();

        // Display the results
        System.out.println("Length of the string (custom method): " + customLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);

        input.close();
    }
}
