// program to calculate the side length of a square based on its perimeter:
import java.util.Scanner;

public class SideOfSquare{
    public static void main(String[] args) {
	
	//make object to take input from user
	Scanner input=new Scanner(System.in);
	
	//take input of first number from user
	System.out.print("Enter the parameter of  square ");
	double parameter = input.nextDouble();
	
	//calculate the length of side
	double side= parameter/4;
	
	//print result
	System.out.println(" The length of the side is ___  " +side+ "  whose perimeter is ____ "+ parameter);
	
	        // Close the scanner
        input.close();
    }
}

