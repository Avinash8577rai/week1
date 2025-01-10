//a Java program for temperature conversion from Celsius to Fahrenheit:

import java.util.Scanner;

public class TemperatureConversionIntoCelsius{

    public static void main(String[] args) {
	
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // take input from user of temperature in celsius a
        System.out.println("Enter the temperature (celsius): ");
        double fahrenheit = input.nextDouble();
		
		//convert  fahrenheit to celsius
		double celsiusResult= (fahrenheit -32);
		
		System.out.println(" The "+ fahrenheit + " fahrenheit is "+ celsiusResult +" celsius ");
		input.close();
		}
		}