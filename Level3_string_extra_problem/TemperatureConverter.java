import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
		
        // Get input from the user
        double temperature = getInput("Enter the temperature: ");
        int choice = getChoice();

        // Perform the conversion based on user
        if (choice == 1) {
			
            // Convert Fahrenheit to Celsius
            double celsius = fahrenheitToCelsius(temperature);
            displayResult(temperature, "Fahrenheit", celsius, "Celsius");
        } else if (choice == 2) {
			
            // Convert Celsius to Fahrenheit
            double fahrenheit = celsiusToFahrenheit(temperature);
            displayResult(temperature, "Celsius", fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Function to take input from the user
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Function to get the conversion choice from the user
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the result of the conversion
    public static void displayResult(double inputTemp, String inputUnit, double outputTemp, String outputUnit) {
        System.out.println(inputTemp + " " + inputUnit + " is equal to " + outputTemp + " " + outputUnit);
    }
}
