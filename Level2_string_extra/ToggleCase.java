import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input from  user for a string
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();


        StringBuilder toggledString = new StringBuilder();
		
		// Loop through each character in the input string
        for (char ch : str1.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // Convert uppercase to lowercase
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // Convert lowercase to uppercase
                toggledString.append(Character.toUpperCase(ch));
            } else {
                // Append non-alphabetic characters as is
                toggledString.append(ch);
            }
        }

        // print the toggled string
        System.out.println("Toggled string: " + toggledString);

        input.close();
    }
}
