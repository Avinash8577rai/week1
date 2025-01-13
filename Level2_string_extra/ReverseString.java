
public class ReverseString{
    public static void main(String[] args){
    
	// create a string variable
	String input= "Capgemini Training Via BridgeLabz";
	 
	// take an empty string  
	String reversed = " ";
	 
        // use loop and reverse the string and store in empty string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
	//print the string 
	System.out.println(" Reversed String is  " + reversed);
	
  }
}
	

