import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the updated date
        LocalDate finalDate = updatedDate.minusWeeks(3);

        // Display the results
        System.out.println("Original Date: " + date);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);

        scanner.close();
    }
}
