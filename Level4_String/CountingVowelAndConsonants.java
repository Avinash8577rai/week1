import java.util.Scanner;

public class CountingVowelAndConsonants {

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

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < findLength(str); i++) {
            String result = checkVowelOrConsonant(str.charAt(i));
            if ("Vowel".equals(result)) {
                vowels++;
            } else if ("Consonant".equals(result)) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(str);

        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        input.close();
    }
}
