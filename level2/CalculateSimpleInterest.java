import java.util.Scanner;

public class CalculateSimpleInterest{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of principal ammount  by user
        System.out.println("Enter the principal ammount: ");
        int principalAmmount= input.nextInt();
		
		// take input of rate of intrest  by user
        System.out.println("Enter the rate of interest: ");
        int rateOfInterest= input.nextInt();
		
		// take input of time period  by user
        System.out.println("Enter the time period: ");
        int timePeriod= input.nextInt();
		
		
		// caluculate the simple interest
		int simpleInterest = principalAmmount * rateOfInterest * timePeriod / 100;
		
		
			          // print the result
         System.out.println(" \nThe Simple Interest is ___ " + simpleInterest + " for principal " + principalAmmount + " rate of interest " + rateOfInterest + " and time " + timePeriod);

		//close the object we create
		input.close();
		}
		}
