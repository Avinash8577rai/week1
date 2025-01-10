import java.util.Scanner;

public class ChocolateDivision{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of number of chocolate by user
        System.out.println("Enter the number of chocolate: ");
        int numberChocolate= input.nextInt();
		
		 // take input of number of children by user
        System.out.println("Enter the numberof children: ");
        int numberChildren= input.nextInt();
		
		//claculate the chocolateper children and remaoining
		int chocolatePerChildren = numberChocolate/numberChildren; 
		int remainingChocolate = numberChocolate% numberChildren;
		
		          // print the result
         System.out.println(" The number of chocolates each child gets is " + chocolatePerChildren +" and the number of remaining chocolates are ___ " + remainingChocolate);

		//close the object we create
		input.close();
		}
		}
