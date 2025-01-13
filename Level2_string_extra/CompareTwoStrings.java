import java.util.Scanner;

public class CompareTwoStrings {
	 public static int compare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1; 
            } else if (char1 > char2) {
                return 1; 
            }
        }

        if (len1 < len2) {
            return -1; 
        } else if (len1 > len2) {
            return 1; 
        }

        return 0;
 }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input from  user for a string
        System.out.print("Enter a first string: ");
        String str1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
		
		// comapre the two string
		int result = compare(str1, str2);
		
		        // print the result of comparison
        if (result < 0) {
		
            System.out.println("The first string is lexicographically smaller.");
        } 
		else if (result > 0) {
		
            System.out.println("The first string is lexicographically greater.");
        } 
		else {
            System.out.println("Both strings are equal.");
        }

        input.close();
    }
}