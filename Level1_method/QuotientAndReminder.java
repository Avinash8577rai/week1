 import java.util.Scanner;
 
 public class QuotientAndReminder{
 
     // method to find a reminder and quotiont of a number
	 public static int[] findRemainderAndQuotient(int number, int divisor){
	      int quotiont= number/divisor;
		  int reminder = number% divisor;
		  return new int[]{quotiont, reminder};
}
		  public static void main(String[] args){
		  
		   // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of  number  by user
        System.out.print("Enter the dividend (number): ");
        int number = input.nextInt();
		
		 System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
		    
			 if (divisor == 0) {
            System.out.println("Division by zero is not allowed. Please enter a valid divisor.");
        } else {
            // Call the method to find the remainder and quotient
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
		  }
		  
		  
		  
		  }
		}