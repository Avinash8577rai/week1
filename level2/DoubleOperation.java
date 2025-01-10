//program to perform the specified double operations while respecting the operator precedence:
import java.util.Scanner;

public class DoubleOperation{

    public static void main(String[] args) {
	
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // take input from user pf vakue a
        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
		
		 // take input from user pf vakue a
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();
		
		 // take input from user pf vakue a
        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();
		
		// perform the double operations
		double result1= a + b *c;
		double result2= a* b +c;
		double result3= c + a / b;
		double result4= a % b + c;
		
        System.out.println("The results of the double operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		
		//close the obbject
		input.close();
		}
		}