//Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class QuotientAndReminder{

    public static void main(String[] args) {
	
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // take input from user of first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
		
		// take input from user of second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
		
		//perform division opertaion on this two number
		int quotient= number1/ number2;
		int reminder= number1%number2;
		
		//print the results
		System.out.println(" The Quotient is ___ " +quotient+ " and Reminder is ___ "+reminder+ " of two number ___ "+number1+ "and " + number2);
		
		        // Close the scanner
        input.close();
    }
}