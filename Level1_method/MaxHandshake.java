// program to check the maximum handshake with students without using methods
import java.util.Scanner;

public class MaxHandshake{
 
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
		
		         // calculte the maximum handshake wituout using method 
		           int maxHandshake = (numberOfStudents*(numberOfStudents - 1))/2;
				   
						   // print the result
		           System.out.print("The maximum number of handshakes among  " + maxHandshake + " and number of students is " + numberOfStudents);
		       }
			   // close the object
			  input.close();
			 }
			 
			}