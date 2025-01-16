import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter {

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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        // Split text using custom method
        String[] customWords = customSplit(str);

        // Split text using built-in split() method
        String[] builtInWords = str.split(" ");

        // Compare the two arrays
        boolean isSame = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("Words from custom method: " + Arrays.toString(customWords));
        System.out.println("Words from built-in method: " + Arrays.toString(builtInWords));
        System.out.println("Do the results match? " + isSame);

        input.close();
    }
}
