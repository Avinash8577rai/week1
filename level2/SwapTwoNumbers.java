//a program to swap the two numbers :


import java.util.Scanner;

public class SwapTwoNumbers{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of first number by user
        System.out.println("Enter the first number: ");
        int number1= input.nextInt();
		
		// take input of second number by user
        System.out.println("Enter the second number: ");
        int number2= input.nextInt();
		
			//print the original number befor swapping
		System.out.println(" Before swapping: number1 = " + number1 + ", number2 = " + number2);
		
		// swap numbers
		int temp = number1;  // store in temporary  file
		number1 = number2;  // assig to number2 in number1
		number2 = temp;   // stiore in temp file	 


          // print the result
         System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);

		//close the object we create
		input.close();
		}
		}