public class NullPointerException {


    public static void main(String[] args) {

        // Step 1: Call the method that generates the NullPointerException
        System.out.println("Demonstrating NullPointerException:");
        generateNullPointerException();

        // Step 2: Call the method that handles the NullPointerException
        System.out.println("\nHandling NullPointerException:");
        handleNullPointerException();
    }

    // Method to generate the NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            // Attempt to call a method on the null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException generated. Message: " + e.getMessage());
        }
    }

    // Method to handle the NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            // Check for null before calling any method on the object
            if (text == null) {
                throw new NullPointerException("Text is null. Cannot perform operations on it.");
            }
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught and handled. Message: " + e.getMessage());
        }
    }
}
