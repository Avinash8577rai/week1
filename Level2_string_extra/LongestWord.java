import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // take string input by user
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
		
		String[] words = str.split("\\s+");
		
		String longestWord = "";
        int maxLength = 0;

       for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        // print the result
        System.out.println("The longest word is: " + longestWord);
        input.close();
    }
}
