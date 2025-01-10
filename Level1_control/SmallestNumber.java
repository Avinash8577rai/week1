import java.util.Scanner;

public class SmallestNumber{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of first number  by user
        System.out.println("Enter the first number: ");
        int number1= input.nextInt();
		
		// take input of second number  by user
        System.out.println("Enter the second number: ");
        int number2= input.nextInt();
		
		// take input of third number  by user
        System.out.println("Enter the third number: ");
        int number3= input.nextInt();
		
		//check if the first number is smaller
		boolean isFirstSmallest = (number1< number2 && number1< number3);


 // print the result
         System.out.println(" Is the first number the smallest?  " + isFirstSmallest  );

		//close the object we create
		input.close();
		}
		}