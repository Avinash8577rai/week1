
public class RemoveDuplicates{
   
   public static void main(String[] args){
   
    // create a string variable
	String input= "capgeminitrainingviabridgelabz";
	
	StringBuilder result = new StringBuilder();
	
	boolean[] seen = new boolean[256];

        // Iterate  the input string
        for (char ch : input.toCharArray()) {
           
               // If the character has not been seen before           
		        if (!seen[ch])  {
		        seen[ch] = true; 
                result.append(ch); 
            }
        }

        // print thr result
        System.out.println("String after removing duplicates: " + result);
   }
}