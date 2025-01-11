// program to check the maximum number of handshake between the students
import java.util.Scanner;

public class NumberOfHandshake{
 
     // create a method to calculate the simple interest
     public static int numberOfHandeshake( int numberOfStudents){

      // formula to calculate the handshake
      return(numberOfStudents*(numberOfStudents - 1 ))/2;
}
          public static void main (String[] args){
			  
            // create an object 
               Scanner input = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students:  ");
        int numberOfStudents = input.nextInt();
		
		// check  if the number pf student is valid 
		if(numberOfStudents < 2) {
		System.out.println(" Number is invaild Minimum two students is required to handshake:  ");
		} else{
		
		         // call the method function here
		           int maxHandshake = numberOfHandeshake(numberOfStudents);
				   
				   // print the result
		           System.out.print("The maximum number of handshakes among  " + maxHandshake + " and number of students is " + numberOfStudents);
		       }
			   // close the object
			  input.close();
			 }
			 
			}