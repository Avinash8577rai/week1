import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input text from the user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Call method to find the first non-repeating character
        char result = firstNonRepeatingCharacter(text);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }

    // Method to find the first non-repeating character in a string
    public static char firstNonRepeatingCharacter(String text) {
        // Create an array to store the frequency of characters (ASCII size 256)
        int[] frequency = new int[256];
        
        // Loop through the text and count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);  // Get character at position i
            frequency[currentChar]++;  // Increment the frequency at the index corresponding to the character
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);  // Get character at position i
            if (frequency[currentChar] == 1) {  // If frequency is 1, it's non-repeating
                return currentChar;
            }
        }

        // If no non-repeating character is found, return '\0' (null character)
        return '\0';
    }
}
