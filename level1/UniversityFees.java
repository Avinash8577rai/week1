//To calculate the discounted amount and the final price the student will pay
public class UniversityFees {
    public static void main(String[] args) {
		
	// define the original fees
	double fees= 125000;
	
	//define how much discouint they got
	double discountPercent= 10;
	
	//calculate the discount in the fees
	double discount= (discountPercent/100)*fees;
	
	/// how much many shoud i pay after discount
	double finalFees= fees-discount;
        System.out.println(" The discount amount is INR ___ "+ discount+ "\n"+" The final discounted fess is INR___"+ finalFees);
    }
}