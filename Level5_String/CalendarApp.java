import java.util.Scanner;

public class CalendarApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and year from user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);
        sc.close();
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (using Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the month and year header
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numDays; day++) {
            // Print each day with proper indentation
            System.out.printf("%3d ", day);

            // If it's Saturday, move to the next line
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
