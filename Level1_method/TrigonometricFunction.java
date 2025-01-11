import java.util.Scanner;

public class TrigonometricFunction{

         // methos to calculate  sine cosine and tengent
       public static double[] calculateTrigonometricFunctions(double angle){
       
	   // convert to calculate the radians
	   double radians = Math.toRadians(angle);
	   
	    // Calculate the trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
	   
	   }
	    public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
        // Get input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculate the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("For the angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        input.close();
    }
}
		
		