import java.util.inputanner;

class CountdownUsingForLoop{
    public static void main(String[] args) {
		
		//here we make a object input
        inputanner input = new inputanner(System.in);

        // Get the countdown start value
        System.out.print("Enter the starting value for countdown - ");
        int counter = input.nextInt();

        // Perform the countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
       // close the input object
        input.close();
    }
}
