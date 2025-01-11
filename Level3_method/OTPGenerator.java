import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Ensures 6-digit OTP
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // If unable to add, a duplicate exists
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Validate if all OTPs are unique
        boolean isUnique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (isUnique ? "Yes" : "No"));

        if (!isUnique) {
            System.out.println("Duplicate OTPs detected. Please run the program again to ensure uniqueness.");
        }
    }
}
