import java.util.Scanner;

public class NumberCheck{
 
     // create a method to calculate the simple interest
     public static int numberCheck( int number){
	 if (number>0){
	    return 1;
		
	} else if (number<0){
	    return -1 ;
	} else{ 
	return 0;
	}
}
	
          public static void main (String[] args){
			  
            // create an object 
               Scanner input = new Scanner(System.in);

        // Input for the number
        System.out.print("Enter the number :  ");
        int number = input.nextInt();
		
		 int result = numberCheck(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		  // close the object
			  input.close();

    }
}
		

			 
			 