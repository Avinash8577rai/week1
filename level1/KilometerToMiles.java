// we have to convert the kilometer distance into miles by taking input from the users
import java.util.Scanner;
public class KilometerToMiles{
	public static void main(String[] args){
	
	//make object to take inp[ut from user
	 Scanner input=new Scanner(System.in);
	 
	 //user to enter the distance in kilometer
	 System.out.println("Enter the kilometer");
		double kilometer= input.nextDouble();  
		
	     
		//define the miles and calculate it 1 km = 1.6 miles
		double distanceOfMiles= kilometer*1.6 ;  
		
		//here we have to print the output of conversion of kilometer into miles 
		System.out.println( " The total miles is __"+distanceOfMiles+ " mile for the given ___ km"+kilometer);
 
input.close();
	}

}