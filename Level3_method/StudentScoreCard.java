import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit marks for Physics, Chemistry, and Maths for each student
    public static int[][] generateMarks(int numberOfStudents) {
        Random rand = new Random();
        int[][] marks = new int[numberOfStudents][3]; // Array to store marks for Physics, Chemistry, and Maths
        
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = 50 + rand.nextInt(50); // Random marks between 50 and 100 for Physics
            marks[i][1] = 50 + rand.nextInt(50); // Random marks between 50 and 100 for Chemistry
            marks[i][2] = 50 + rand.nextInt(50); // Random marks between 50 and 100 for Maths
        }
        
        return marks;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] marks) {
        double[][] scores = new double[marks.length][4]; // [total, average, percentage]
        
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Round the values to 2 decimal places
            scores[i][0] = Math.round(total * 100.0) / 100.0;
            scores[i][1] = Math.round(average * 100.0) / 100.0;
            scores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return scores;
    }

    // Method to display the scorecard of all students with their scores, total, average, and percentage
    public static void displayScorecard(int[][] marks, double[][] scores) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t", i + 1);
            System.out.printf("%d\t\t", marks[i][0]);
            System.out.printf("%d\t\t", marks[i][1]);
            System.out.printf("%d\t\t", marks[i][2]);
            System.out.printf("%.2f\t", scores[i][0]);
            System.out.printf("%.2f\t", scores[i][1]);
            System.out.printf("%.2f\n", scores[i][2]);
        }
    }

    public static void main(String[] args) {
        // Take input for the number of students
        int numberOfStudents = 5; // For example, 5 students
        
        // Generate random marks for students
        int[][] marks = generateMarks(numberOfStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] scores = calculateScores(marks);
        
        // Display the scorecard
        displayScorecard(marks, scores);
    }
}
