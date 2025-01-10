//To calculate the discounted amount and the final price the student will pay
import java.util.Scanner;

public class UniversityFeesCalculate{
    public static void main(String[] args) {
	
	//make object to take inp[ut from user
	Scanner input=new Scanner(System.in);
		
	// let take input from user for original fees
	double fees= input.nextDouble();
	
	//let takes discount input from user
	double discountPercent= input.nextDouble();
	
	//calculate the discount in the fees
	double discount= (discountPercent/100)*fees;
	
	/// how much many shoud i pay after discount
	double finalFees= fees-discount;
        System.out.println(" The discount amount is INR ___ "+ discount+ "\n"+" The final discounted fess is INR___"+ finalFees);
		input.close();
    }
}