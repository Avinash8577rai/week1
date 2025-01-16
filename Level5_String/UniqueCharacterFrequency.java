import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Call method to find unique characters in the string
        char[] uniqueChars = uniqueCharacters(text);

        // Call method to find the frequency of characters in the string
        String[][] frequencyResult = findCharacterFrequency(text, uniqueChars);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + ": " + frequencyResult[i][1]);
        }

        sc.close();
    }

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        boolean[] visited = new boolean[256]; // ASCII range (256 characters)
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through the string and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                uniqueChars.append(currentChar);
            }
        }

        // Convert the StringBuilder to a character array and return
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters and return as a 2D array
    public static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256]; // Array to store the frequency of characters (ASCII size)

        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them along with their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            result[i][0] = String.valueOf(uniqueChar);  // Store the character
            result[i][1] = String.valueOf(frequency[uniqueChar]); // Store the frequency
        }

        return result;
    }
}
