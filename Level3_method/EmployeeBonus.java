import java.util.Random;

public class EmployeeBonus {

    // Method to generate the random salary and years of service for employees
    public static double[][] generateEmployeeDetails(int numberOfEmployees) {
        Random rand = new Random();
        double[][] employeeDetails = new double[numberOfEmployees][2]; // Array to store [salary, years of service]
        
        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate random salary (5-digit number) between 10000 and 99999
            employeeDetails[i][0] = 10000 + rand.nextInt(90000);
            // Generate random years of service between 1 and 15
            employeeDetails[i][1] = 1 + rand.nextInt(15);
        }
        return employeeDetails;
    }

    // Method to calculate the new salary and bonus based on the years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeDetails) {
        double[][] updatedEmployeeDetails = new double[employeeDetails.length][3]; // [old salary, bonus, new salary]
        
        for (int i = 0; i < employeeDetails.length; i++) {
            double oldSalary = employeeDetails[i][0];
            int yearsOfService = (int) employeeDetails[i][1];
            double bonus = 0;
            
            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus if years of service is more than 5
            } else {
                bonus = oldSalary * 0.02; // 2% bonus if years of service is less than or equal to 5
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;
            
            // Store old salary, bonus, and new salary in updated array
            updatedEmployeeDetails[i][0] = oldSalary;
            updatedEmployeeDetails[i][1] = bonus;
            updatedEmployeeDetails[i][2] = newSalary;
        }
        return updatedEmployeeDetails;
    }

    // Method to calculate the sum of old salaries, new salaries, and total bonus amount
    public static void calculateTotalAmounts(double[][] updatedEmployeeDetails) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        for (int i = 0; i < updatedEmployeeDetails.length; i++) {
            totalOldSalary += updatedEmployeeDetails[i][0];
            totalNewSalary += updatedEmployeeDetails[i][2];
            totalBonus += updatedEmployeeDetails[i][1];
        }

        // Display the results in a tabular format
        System.out.println("Employee | Old Salary | Bonus | New Salary");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < updatedEmployeeDetails.length; i++) {
            System.out.printf("%d        | %.2f      | %.2f  | %.2f\n", i + 1, updatedEmployeeDetails[i][0], updatedEmployeeDetails[i][1], updatedEmployeeDetails[i][2]);
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Total    | %.2f      | %.2f  | %.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10; // 10 employees in the company
        double[][] employeeDetails = generateEmployeeDetails(numberOfEmployees); // Generate random details
        
        // Calculate bonus and new salary
        double[][] updatedEmployeeDetails = calculateBonusAndNewSalary(employeeDetails);

        // Calculate and display the total amounts and employee details
        calculateTotalAmounts(updatedEmployeeDetails);
    }
}
