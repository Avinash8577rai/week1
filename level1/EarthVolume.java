//to calculate the volume of Earth in both cubic kilometers and cubic miles

public class EarthVolume {
    public static void main(String[] args) {
	
	//define the constants
	 double radiusKm=6378;
	 
	 //change the km into miles
	 double radiusMiles=radiusKm*1.6;
	 
	 //calculate the volume of the earth in cubic km
       double volumeKm3=(4/3)*3.14*Math.pow(radiusKm,3);
	   
	   //convert radius to miles and calculate the volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * 3.14 * Math.pow(radiusMiles, 3);
		
		//print the result
        System.out.println("The volume of earth in cubic kilometers is ____ "+ volumeKm3 + "\n"+"The cubic miles is ____"+volumeMiles3);
    }
}