import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend's index
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend's index
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend
        int youngestIndex = findYoungest(ages);
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);

        // Finding the tallest friend
        int tallestIndex = findTallest(heights);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        scanner.close(); // Close scanner to free resources
    }
}
