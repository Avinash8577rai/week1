// a program to convert a distance in feet to yards and miles:
import java.util.Scanner;

public class DistanceCovertor{
    public static void main(String[] args) {
	
	//make object to take input from user
	Scanner input=new Scanner(System.in);
	
	//take input distance in feet from user
	System.out.print("Enter the distancein feet ");
	double distanceFeet = input.nextDouble();
	
	//convert feet into yards
	double distanceYards = distanceFeet/3;
	
	//convert yards into miles
	double distanceMiles = distanceFeet/ (1760*3);
	
	//print the reuslt
	
	System.out.println("The distance in yards is " +distanceYards);
	System.out.println("The distance in miles is " + distanceMiles);
	
	        // Close the scanner
        input.close();
    }
}