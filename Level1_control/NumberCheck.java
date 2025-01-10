import java.util.Scanner;

public class NumberCheck{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of number  by user
        System.out.println("Enter the number is: ");
        int number= input.nextInt();
		
		//checking the number is postive, negitve or zero
				   if(number> 0){
				    
				System.out.println("The number is positve" );
		
		}else if (number<0){
		
		
         System.out.println("The number is negitve"  );
		}
		else{
		System.out.println("The number is zero"  );
		}

		//close the object we create
		input.close();
		}
		}