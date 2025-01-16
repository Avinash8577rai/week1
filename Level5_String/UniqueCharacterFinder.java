// Program 2: Find Unique Characters in a String
import java.util.Scanner;

public class UniqueCharacterFinder {

    public static int calculateLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        char[] result = new char[uniqueIndex];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }
}
