import java.util.Scanner;

public class ChocolatesDistrubution{

 public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren){
  int chocolatesPerChildren =  numberOfchocolates / numberOfChildren;
  int chcolatesRemaining = numberOfchocolates % numberOfChildren;
   
   return new int [] {chocolatesPerChildren, chcolatesRemaining};
  }
    public static void main( String[] args) {
		
		// create the object for taking input
	Scanner input = new Scanner(System.in);
	
	// taking input of number of children
	System.out.print( " Enter the number of Chocolates ");
	int numberOfchocolates = input.nextInt();
	
	// taking input number of chocolate
	System.out.print( " Enter the number of Chocolates ");
	int numberOfChildren = input.nextInt();
	
	   if(numberOfChildren ==0) {
	   System.out.print( " The number of children cannot be Zero invaild number ");
	   }
	   else{
		    // call the method
	        int[] result= findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
			
			// display the result
			 System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
	   }
	     // close the object
		input.close();
	}
}
	   
	   
	
	
	