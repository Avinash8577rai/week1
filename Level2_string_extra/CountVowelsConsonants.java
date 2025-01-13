import java.util.Scanner;

   public class CountVowelsConsonants {
    
	public static void main(String[] args){
	

        String input = "CAPGEMINI TRAINING VIA BRIDGELABZ";

        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through the string
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; // Increment vowel count
                } else {
                    consonantCount++; // Increment consonant count
                }
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);


    }
}

