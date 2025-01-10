//a Java program for temperature conversion from Celsius to Fahrenheit:

import java.util.Scanner;

public class TemperatureConversion{

    public static void main(String[] args) {
	
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // take input from user of temperature in celsius a
        System.out.println("Enter the temperature (celsius): ");
        double celsius = input.nextDouble();
		
		//convert celsius to fahrenheit
		double fahrenheit= (celsius *9/5)+32;
		
		System.out.println(" The "+ celsius + " celsius is "+ fahrenheit +" fahrenheit ");
		input.close();
		}
		}