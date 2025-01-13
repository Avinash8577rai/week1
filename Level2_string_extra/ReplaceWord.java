import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Output the result
        System.out.println("Modified Sentence: " + modifiedSentence);

        input.close();
    }

    // Method to replace the word in the sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
      
	  
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
