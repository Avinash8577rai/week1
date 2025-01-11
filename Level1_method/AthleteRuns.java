
import java.util.Scanner;

public class AthleteRuns{

         // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed
    public static  double calculateRounds(double perimeter, double targetDistance) {
        return targetDistance / perimeter;
    }
    
          public static void main (String[] args){
			  
            // create an object 
               Scanner input = new Scanner(System.in);

        // Input for the side of tiangle
        System.out.print("Enter the side1:  ");
        double side1 = input.nextDouble();
		
		
		// Input for the side of tiangle
        System.out.print("Enter the side2:  ");
        double side2 = input.nextDouble();
		
		
		// Input for the side of tiangle
        System.out.print("Enter the side3:  ");
        double side3 = input.nextDouble();
		
		double perimeter = calculatePerimeter(side1, side2, side3);
		
		
		        if (perimeter<=0){
				   System.out.print(" the traingle is not vaild " );
				} else{
				     double targetDistance=5000;
				   
				   double rounds= calculateRounds(perimeter, targetDistance);
				   // prdouble the result
		           System.out.println("The athlete needs to complete   " + Math.ceil(rounds) + " round to cover " );
		       }
			   // close the object
			  input.close();
			 }
			 
			}