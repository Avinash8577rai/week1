public class PalindromeStringCheck{
   
   public static void main(String[] args){
   
    // create a string variable
	String input= "aabbaa";
	
	// take an empty string  
	String reversed = " ";
	 
        // use loop and reverse the string and store in empty string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
		 if (input.equals(reversed)){
		 System.out.println("The string  aabbaa is a palindrome.");
		 }else {
		 
		        System.out.println("The string is not a palindrome.");
			}
   
  } 
}   