//a Java program that takes user inputs for name, cities, distances, and time, and calculates the total distance and total time:

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take user inputs for name and cities
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Calculate total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Take user inputs for time
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double timeFromToVia = input.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double timeViaToFinalCity = input.nextDouble();

        // Calculate total time
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the results
        System.out.println("\n   Travel Details   ");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " hours");

        // Close the scanner
        input.close();
    }
}
