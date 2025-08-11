
import java.util.Scanner;

public class SimpleGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        // Arrays to store names and grades
        String[] names = new String[count];
        int[] grades = new int[count];

        // Input student data
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter grade for " + names[i] + ": ");
            grades[i] = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
        }

        // Initialize stats
        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];
        int highIndex = 0;
        int lowIndex = 0;

        // Calculate stats
        for (int i = 0; i < count; i++) {
            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
                highIndex = i;
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
                lowIndex = i;
            }
        }

        double average = (double) total / count;

        // Display summary
        System.out.println("\n===== Student Grade Summary =====");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " - Grade: " + grades[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Average Grade : " + average);
        System.out.println("Highest Grade : " + highest + " (" + names[highIndex] + ")");
        System.out.println("Lowest Grade  : " + lowest + " (" + names[lowIndex] + ")");
    }
}