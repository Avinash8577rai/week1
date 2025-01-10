//program to perform the specified integer operations while respecting the operator precedence:
import java.util.Scanner;

public class IntOperation{

    public static void main(String[] args) {
	
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // take input from user pf vakue a
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
		
		 // take input from user pf vakue a
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
		
		 // take input from user pf vakue a
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();
		
		// perform the integer operations
		int result1= a + b *c;
		int result2= a* b +c;
		int result3= c + a / b;
		int result4= a % b + c;
		
        System.out.println("The results of the integer operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		
		//close the obbject
		input.close();
		}
		}