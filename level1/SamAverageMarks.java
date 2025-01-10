//we have to calculate the average marks percentage of the sam's 
public class SamAverageMarks{
	 public static void main (String[] args){
		int mathsMarks= 94; //define the mathsMarks of sam
		int physicsMarks= 95; //define the physicsMarks of sam
		int chemistryMarks= 96; // define the chemistryMarks of sam
		
		//now we have to add all the marks of sam together 
		
		int totalMarks= mathsMarks+physicsMarks+chemistryMarks;
		
		//here we have calculate the average marks of the sams number 
		
		double averageMarks= totalMarks/3;
		
		//now  we calulatye the average marks into perntage
		
		double averagePercentage= (averageMarks/100)*100;
		
		// now we print the result of the sam  average marks percentage
		System.out.println( " Sam’s average mark in PCM is " + averagePercentage);
	 
	 }
	 
}