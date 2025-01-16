import java.util.Scanner;

public class CharacterFrequency4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input text from the user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Call method to find the frequency of characters in the string
        String[][] frequencyResult = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + ": " + frequencyResult[i][1]);
        }

        sc.close();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (ASCII size 256)
        int[] frequency = new int[256];
        
        // Loop through the text and count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);  // Get character at position i
            frequency[currentChar]++;  // Increment the frequency at the index corresponding to the character
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[text.length()][2];
        int resultIndex = 0;  // Index for the result array

        // Loop through the frequency array to store characters with non-zero frequency
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[resultIndex][0] = String.valueOf((char) i);  // Store the character
                result[resultIndex][1] = String.valueOf(frequency[i]);  // Store its frequency
                resultIndex++;
            }
        }

        // Return the 2D array containing characters and their frequencies
        return result;
    }
}
