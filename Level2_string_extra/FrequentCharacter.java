import java.util.Scanner;
import java.util.HashMap;

public class FrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String input) {
	
        // HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

 
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = 0;

        
        for (char ch : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(ch);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take the user for input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Find and display the most frequent character
		
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        input.close();
    }

    
}
