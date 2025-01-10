import java.util.Scanner;

public class SpringSeason{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input of number  by user
        System.out.println("Enter the month  (1 for January, 2 for February, ..., 12 for December): ");
        int month= input.nextInt();
		
		System.out.println("Enter the day : ");
        int day= input.nextInt();
		
		 // Check if the date falls in the Spring season (March 20 to June 20)
		boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20-31
                           (month == 4 && day >= 1 && day <= 30) ||  // April 1-30
                           (month == 5 && day >= 1 && day <= 31) ||  // May 1-31
                           (month == 6 && day >= 1 && day <= 20);    // June 1-20
		
		//print the result
		if (isSpring){
		
				System.out.println("It's a Spring Season" );
				}else{
				  System.out.println("not a Spring Season" );
				
			}	
		

		//close the object we create
		input.close();
		}
		}