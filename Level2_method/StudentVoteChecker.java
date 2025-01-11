import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        // Check for negative age
        if (age < 0) {
            return false; // Invalid age
        }
        // Check if age is 18 or above
        return age >= 18; // Eligible to vote
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] studentAges = new int[10];

        // Input ages for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Age is invalid.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
            }
        }

        scanner.close(); // Close the scanner to release resources
    }
}
