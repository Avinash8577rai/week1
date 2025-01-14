import java.util.Scanner;

public class StringCharacterComparison {
    public static void main(String[] args) {


        // Take user input for the string
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = input.nextLine();

        // Get characters using the user-defined method
        char[] userDefinedChars = getCharacters(str1);

        // Get characters using the built-in toCharArray() method
        char[] builtInChars = str1.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display results
        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using built-in toCharArray() method: " + new String(builtInChars));
        System.out.println("Are both methods equal? " + areEqual);
    }

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
