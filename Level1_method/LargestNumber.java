import java.util.Scanner;

public class LargestNumber{
 public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
    int smallest = Math.min(number1, Math.min(number2, number3)); // Find the smallest number
        int largest = Math.max(number1, Math.max(number2, number3)); // Find the largest number
        return new int[]{smallest, largest}; // Return both as an array
    }


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
		
		int[] result= findSmallestAndLargest(number1, number2, number3);
		
		 // print the result
         System.out.println(" the smallest number is   " + result[0]  );
		 System.out.println(" the largest number is  " + result[1]  );

		//close the object we create
		input.close();
		}
		}