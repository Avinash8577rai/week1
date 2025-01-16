import java.util.Scanner;
import java.util.Arrays;

public class TextSplitterLength {

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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] wordLength : wordLengthArray) {
            int currentLength = Integer.parseInt(wordLength[1]);
            if (currentLength < minLength) {
                shortest = wordLength[0];
                minLength = currentLength;
            }
            if (currentLength > maxLength) {
                longest = wordLength[0];
                maxLength = currentLength;
            }
        }

        return new String[]{shortest, longest};
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

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Display results in a tabular format
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengthArray) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        input.close();
    }
}
