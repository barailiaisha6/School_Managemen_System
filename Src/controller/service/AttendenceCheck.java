import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentStatus = "";
        String teacherStatus = "";

        System.out.println("School Attendance Tracking System ");
        System.out.println("1. Mark Student Attendance");
        System.out.println("2. Mark Teacher Attendance");
        System.out.println("3. View Attendance");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {

            System.out.print("Is the student present? (yes/no): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                studentStatus = "Present";
            } else {
                studentStatus = "Absent";
            }

            System.out.println("Student attendance marked!");

        } else if (choice == 2) {

            System.out.print("Is the teacher present? (yes/no): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                teacherStatus = "Present";
            } else {
                teacherStatus = "Absent";
            }

            System.out.println("Teacher attendance marked!");

        } else if (choice == 3) {

            System.out.println(" Attendance Report ");
            System.out.println("Student: " + studentStatus);
            System.out.println("Teacher: " + teacherStatus);

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
