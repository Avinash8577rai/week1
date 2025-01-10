import java.util.Scanner;

public class ConversionOfWeight{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of weight in pounds  by user
        System.out.println("Enter the weight in  pounds: ");
        double weightInPounds= input.nextDouble();
		
		//convert pounds to kilogram
		double kilogram = weightInPounds*2.2;
		
		
		
			          // print the result
         System.out.println(" The weight of the person in pound is " + weightInPounds +" and in kg is " + kilogram );

		//close the object we create
		input.close();
		}
		}