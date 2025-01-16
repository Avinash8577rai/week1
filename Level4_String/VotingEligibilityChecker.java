import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Random 2-digit age
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age cannot vote
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false"; // Check eligibility
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayVotingEligibility(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] eligibilityData = checkVotingEligibility(ages);

        // Display results
        displayVotingEligibility(eligibilityData);

        input.close();
    }
}
