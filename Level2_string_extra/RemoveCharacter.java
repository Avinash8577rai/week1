import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TAKE the user for input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        // Remove the specified character
        String modifiedString = removeCharacter(str, charToRemove);

       
        System.out.println("Modified String: " + modifiedString);

        input.close();
    }

    // Method to remove thr character
    public static String removeCharacter(String input, char charToRemove) {
        
		// Replace all occurrences of tHE CHAracter
        return input.replaceAll(Character.toString(charToRemove), "");
    }
}
