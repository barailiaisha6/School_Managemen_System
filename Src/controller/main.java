import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to School Management System!");
        System.out.println("1. View Students");
        System.out.println("2. Add Student");
        System.out.println("3. View Teachers");
        System.out.println("4. Add Teacher");
        System.out.println("5. View Fees Details");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" list of students");
                break;
            case 2:
                System.out.println("Adding a new student");
                break;
            case 3:
                System.out.println(" list of teachers");
                break;
            case 4:
                System.out.println("Adding a new teacher");
                break;
            case 5:
                System.out.println(" fees details");
                break;
            case 6:
                System.out.println("Exiting system");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
