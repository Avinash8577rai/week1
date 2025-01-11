import java.util.Arrays;

public class RandomNumberAnalysis {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit number (1000-9999)
        }
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number); // Find minimum
            max = Math.max(max, number); // Find maximum
        }

        double average = (double) sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return results in an array
    }

    public static void main(String[] args) {
        int size = 5; // Number of random numbers to generate

        // Generate random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Calculate average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
