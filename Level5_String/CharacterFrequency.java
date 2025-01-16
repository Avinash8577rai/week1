import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input text from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Call method to find the frequency of characters
        String[] result = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character frequencies:");
        for (String res : result) {
            System.out.println(res);
        }
        
        sc.close();
    }

    // Method to find frequency of characters
    public static String[] findCharacterFrequency(String text) {
        // Convert text to character array
        char[] charArray = text.toCharArray();
        
        // Create an array to store frequencies of characters
        int[] frequency = new int[charArray.length];
        
        // Create a String array to store characters and their frequencies
        String[] result = new String[charArray.length];
        
        // Nested loops to count the frequency of characters
        for (int i = 0; i < charArray.length; i++) {
            // Skip if the character is already counted
            if (frequency[i] == 0) {
                int count = 1;  // Initialize the count for the current character
                
                // Compare current character with the rest of the characters
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        // Increment the frequency for duplicate characters
                        count++;
                        frequency[j] = -1;  // Mark this character as counted
                    }
                }
                
                // Store the character and its frequency in the result array
                result[i] = charArray[i] + ": " + count;
            }
        }
        
        return result;
    }
}
