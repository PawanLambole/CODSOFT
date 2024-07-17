import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] subjects = new String[numSubjects];
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        // Input subject names and marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter name for subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Calculate grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Marks for " + subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
