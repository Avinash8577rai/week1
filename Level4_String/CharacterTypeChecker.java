import java.util.Scanner;

public class CharacterTypeChecker {

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

    // Method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
        // Convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string
    public static String[][] findCharacterTypes(String str) {
        int length = findLength(str);
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        for (String[] entry : charTypes) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        // Find character types
        String[][] charTypes = findCharacterTypes(str);

        // Display the character types in a tabular format
        displayCharacterTypes(charTypes);

        input.close();
    }
}
