// a program to convert height from centimeters to feet and inches:
import java.util.Scanner;

public class HeightConvert{
    public static void main(String[] args) {
	
	//make object to take inp[ut from user
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter your height in centimeters");
	double heightCm= input.nextDouble();
	
	double heightInches= heightCm/ 2.54;
	
	 // Calculate feet and remaining inches
        int heightFeet = (int) (heightInches / 12);  // Whole feet
        double remainingInches = heightInches % 12;  // Remainder in inches
	// print result
	System.out.println("Your Height in cm is "+ heightCm + "\n" + "In feet is ___"+ heightFeet + " and inches is"+remainingInches);
	input.close();
	}
	}

	