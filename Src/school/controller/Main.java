import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" School Attendance System ");
        System.out.println("1. Student Attendance");
        System.out.println("2. Teacher Attendance");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Student Name: ");
            sc.nextLine();  // Clear input buffer
            String studentName = sc.nextLine();

            System.out.print("Enter Total Classes Held: ");
            int totalClasses = sc.nextInt();

            System.out.print("Enter Classes Attended: ");
            int attended = sc.nextInt();

            if (totalClasses > 0) {
                double percentage = (attended * 100.0) / totalClasses;

                System.out.println("\n--- Student Attendance Report ---");
                System.out.println("Student Name: " + studentName);
                System.out.println("Attendance Percentage: " + percentage + "%");

                if (percentage >= 75) {
                    System.out.println("Status: Allowed to take exam");
                } else {
                    System.out.println("Status: Not allowed to take exam");
                }

            } else {
                System.out.println("Invalid number of classes!");
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter Teacher Name: ");
            sc.nextLine();  
            String teacherName = sc.nextLine();

            System.out.print("Enter Total Working Days: ");
            int totalDays = sc.nextInt();

            System.out.print("Enter Days Present: ");
            int presentDays = sc.nextInt();

            if (totalDays > 0) {
                double percentage = (presentDays * 100.0) / totalDays;

                System.out.println(" Teacher Attendance Report ");
                System.out.println("Teacher Name: " + teacherName);
                System.out.println("Attendance Percentage: " + percentage + "%");

                if (percentage >= 80) {  // Example rule
                    System.out.println("Status: Good Attendance");
                } else {
                    System.out.println("Status: Needs Improvement");
                }

            } else {
                System.out.println("Invalid number of working days!");
            }
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
