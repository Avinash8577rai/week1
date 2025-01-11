import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for months and days within the Spring Season range
        if (month == 3 && day >= 20 && day <= 31) { // March 20 to March 31
            return true;
        } else if (month == 4 && day >= 1 && day <= 30) { // April
            return true;
        } else if (month == 5 && day >= 1 && day <= 31) { // May
            return true;
        } else if (month == 6 && day >= 1 && day <= 20) { // June 1 to June 20
            return true;
        } else {
            return false; // Outside Spring Season
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Validate input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month and day.");
        } else {
            // Check if the date is in the Spring Season
            boolean result = isSpringSeason(month, day);

            // Display the result
            if (result) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
		input.close();
    }
}
