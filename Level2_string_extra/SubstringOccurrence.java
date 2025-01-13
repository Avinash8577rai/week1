import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input from  user for a string
        System.out.print("Enter a string: ");
        String str1 = input.nextLine();
		
		 // input from  user for a substring
        System.out.print("Enter a substring: ");
        String str2 = input.nextLine();
		
		int count =0;

        int index = str1.indexOf(str2);

      
        while (index != -1) {
            count++; 
            index = str1.indexOf(str2, index + 1); 
        }

        // print the result
        System.out.println("The substring '" + str2 + "' occurs " + count + " times in the string.");

     
        input.close();
    }
}
