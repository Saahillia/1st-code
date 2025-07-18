import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalWeightedGradePoints = 0;
        double totalCreditHours = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter marks (out of 100): ");
            double marks = scanner.nextDouble();

            System.out.print("Enter credit hours: ");
            double creditHours = scanner.nextDouble();

            // Example: Simple conversion of marks to grade points (adjust as per your system)
            double gradePoint = marks / 10.0; // Assuming a 10-point scale for simplicity

            totalWeightedGradePoints += (gradePoint * creditHours);
            totalCreditHours += creditHours;
        }

        if (totalCreditHours > 0) {
            double cgpa = totalWeightedGradePoints / totalCreditHours;
            System.out.printf("\nYour CGPA is: %.2f\n", cgpa);
        } else {
            System.out.println("Cannot calculate CGPA: No credit hours entered.");
        }

        scanner.close();
    }
}