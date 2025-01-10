import java.util.Scanner;

public class LargestNumber{

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
		boolean isFirstLargest = (number1> number2 && number1> number3);
        boolean isSecondLargest = (number2> number1 && number2> number3);
		boolean isThirdLargest = (number3> number1 && number3> number2);
		
		 // print the result
         System.out.println(" Is the first number the largest?  " + isFirstLargest  );
		 System.out.println(" Is the second number the largest?  " + isSecondLargest  );
		 System.out.println(" Is the third number the largest?  " + isThirdLargest  );

		//close the object we create
		input.close();
		}
		}