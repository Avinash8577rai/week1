// a program to calculate the total income of a person by taking salary and bonus as input:


import java.util.Scanner;

public class TotalIncome{

    public static void main(String[] args) {
	
        // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // take input from user of there salary
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();
		
		 // take input from user of there bonus
        System.out.println("Enter the bonus ammount: ");
        int bonus = input.nextInt();
		
		
		// total incom with salary and bonus
		int totalIncome= salary + bonus;
		
		//print result
		System.out.println(" The salaryis INR "+ salary + " and bonus is INR "+ bonus +" Hence total income is INR " + totalIncome);
		
		//close the object we create
		input.close();
		}
		}