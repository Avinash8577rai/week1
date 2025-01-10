
import java.util.Scanner;

public class AthleteRunPark{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of side of triangle by user
        System.out.println("Enter the first side of the park in meter: ");
        int side1= input.nextInt();
		
		
        System.out.println("Enter the second side of the park in meter: ");
        int side2= input.nextInt();
		
		System.out.println("Enter the third side of the park in meter: ");
        int side3= input.nextInt();
		
		//calculate the parameter of the park
		int parameter = side1 + side2 + side3;
		
		//convert total diustance to meter 
		int totalDistance = 5000;
		
		//calculate the number of rounds
		int round = totalDistance/parameter;
		
		          // print the result
         System.out.println("The total number of rounds the athlete will run  is  "+round +" to complete 5km");

		//close the object we create
		input.close();
		}
		}
