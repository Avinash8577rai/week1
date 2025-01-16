import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two texts from user
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);
        
        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert both texts to lower case for case-insensitive comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store frequency of characters in text1 and text2
        int[] charCount1 = new int[26]; // for lowercase letters 'a' to 'z'
        int[] charCount2 = new int[26];

        // Count frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            charCount1[text1.charAt(i) - 'a']++;
        }

        // Count frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            charCount2[text2.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }
}
