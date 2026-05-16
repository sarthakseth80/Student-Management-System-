package student;

import java.util.Scanner;

// Main class - Entry point of the program
// Demonstrates CLASSES and OBJECTS by creating and using objects
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an OBJECT of StudentManager class
        StudentManager manager = new StudentManager();

        // Adding some sample students (creating OBJECTS of Student class)
        manager.addStudent(new Student("S001", "Sarthak Seth", 20, "aarav@email.com", "Java ", 98.5));
        manager.addStudent(new Student("S002", "Mandar Amte", 21, "priya@email.com", "Java ", 95.0));
        manager.addStudent(new Student("S003", "Harsh Prasad ", 19, "rahul@email.com", "Python ", 92.0));
        manager.addStudent(new Student("S004", "Pramukh Gandhi", 22, "sneha@email.com", "Python ", 85.0));
        manager.addStudent(new Student("S005", "Krish Singh", 20, "karan@email.com", "Java ", 49.0));

        // Demonstrating POLYMORPHISM - same type reference, different behaviors
//        System.out.println("\n--- Polymorphism Demo: Calling displayInfo() ---");
//        Person p1 = new Student("S006", "Demo Student", 21, "demo@email.com", "Demo Course", 78.0);
//        Person p2 = new Teacher("T001", "Prof. Neha Verma", 35, "neha@email.com", "Data Structures");
//        p1.displayInfo(); // Calls Student's version
//        p2.displayInfo(); // Calls Teacher's version

        System.out.println("\n--- Welcome to Student Management System ---\n");

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {

                case 1: // Add Student
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = 0;
                    try { age = Integer.parseInt(scanner.nextLine()); }
                    catch (NumberFormatException e) { System.out.println("Invalid age."); break; }
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Marks (0-100): ");
                    double marks = 0;
                    try { marks = Double.parseDouble(scanner.nextLine()); }
                    catch (NumberFormatException e) { System.out.println("Invalid marks."); break; }
                    manager.addStudent(new Student(id, name, age, email, course, marks));
                    break;

                case 2: // View All Students
                    manager.displayAllStudents();
                    break;

                case 3: // Search by ID
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student found = manager.findStudentById(searchId);
                    if (found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Update Marks
                    System.out.print("Enter Student ID: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = 0;
                    try { newMarks = Double.parseDouble(scanner.nextLine()); }
                    catch (NumberFormatException e) { System.out.println("Invalid marks."); break; }
                    manager.updateMarks(updateId, newMarks);
                    break;

                case 5: // Remove Student
                    System.out.print("Enter Student ID to remove: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;

                case 6: // View by Course
                    System.out.print("Enter Course Name: ");
                    String courseFilter = scanner.nextLine();
                    manager.displayByCourse(courseFilter);
                    break;

                case 7: // Display Topper
                    manager.displayTopper();
                    break;

                case 8: // Pass/Fail Count
                    manager.displayPassFailCount();
                    break;

                case 9: // Exit
                    System.out.println("Thank you for using Student Management System. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-9.");
            }
        }

        scanner.close();
    }

    // Helper method to print menu
    static void printMenu() {
        System.out.println("\n========= HOME PAGE =========");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student Marks");
        System.out.println("5. Remove Student");
        System.out.println("6. View Students by Course");
        System.out.println("7. Display Class Topper");
        System.out.println("8. Pass/Fail Summary");
        System.out.println("9. Exit");
        System.out.println("========================");
    }
}
