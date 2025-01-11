import java.util.Scanner;

public class WindChill{

    public  static double  calculateWindChill(double tempertaure , double windSpeed){

    double windchill  = 35.74 + 0.6215 * tempertaure + ( 0.4275 * tempertaure - 35.75) * Math.pow(windSpeed, 0.16);
    
	return windchill;
     
	 }	
        public static void main(String[] args){
		
		
		// create the object 
		Scanner input = new Scanner(System.in);
		
			// taking input of tempertaure by user
		System.out.print( " Enter the tempertaure ");
	    double tempertaure = input.nextDouble();
	
        	// taking input of windspeed by user
	    System.out.print( " Enter the windspeed ");
	    double windSpeed = input.nextDouble();
		     
			    if(windSpeed<0){
				
				System.out.print( " windspeed cannot be zero ");
				}
				else{
				    
					double windchill= calculateWindChill(tempertaure, windSpeed);
				
				System.out.println("The wind chill temperature is: " + windchill);
             
			    }
		
		
			     // close the object
		input.close();
		}
	}
