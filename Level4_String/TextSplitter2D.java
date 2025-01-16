import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter2D {

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

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count the number of words by identifying spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int start = 0, index = 0;

        // Extract words using spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                if (i == length - 1) i++; // Include the last character
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findLength(words[i]));
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        // Split text using custom method
        String[] customWords = customSplit(str);

        // Get words with lengths
        String[][] wordLengthArray = wordsWithLengths(customWords);

        // Display results in a tabular format
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengthArray) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        input.close();
    }
}
