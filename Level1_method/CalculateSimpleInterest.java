
// program to calculate the simple interest by taking input of principal, time , rate 
import java.util.Scanner;

public class CalculateSimpleInterest{
 
     // creat a method to calculate the simple interest
     public static double calculateSimpleInterest( double principal, double rate, double time){

      // formula for simple interest in returntype
      return(principal*rate*time)/100;
}
          public static void main (String[] args){
			  
            // create an object 
               Scanner input = new Scanner(System.in);

        // Input for Principal amount
        System.out.print("Enter the Principal amount:  ");
        double principal = input.nextDouble();
		
		// Input for Time
        System.out.print("Enter the time:  ");
        double time = input.nextDouble();
		
		// Input for rate of interest
        System.out.print("Enter the rate of interest:  ");
        double rate = input.nextDouble();
		
		// print thr result
		double simpleInterest= calculateSimpleInterest( principal, rate, time);
		System.out.println(" Output : The Simple Interest is " + simpleInterest + " for Principal " + principal+ " Rate of Interest " + rate + " and time " + time + " years " );
		
		// close the object 
		input.close();
}
 
}

		