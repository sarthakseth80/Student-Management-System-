package student;

import java.util.ArrayList;

// This class manages all students - demonstrates CLASSES and OBJECTS
public class StudentManager {

    // Private list - to Achieve ENCAPSULATION
    private ArrayList<Student> studentList;
    private int totalStudentsAdded;

    // Default Constructor
    public StudentManager() {
        studentList = new ArrayList<>();
        totalStudentsAdded = 0;
    }

    // Add a new student (Added in arraylist)
    public void addStudent(Student student) {
        // Check for duplicate ID
        if (findStudentById(student.getStudentId()) != null) {
            System.out.println("Error: Student with ID " + student.getStudentId() + " already exists!");
            return;
        }
        studentList.add(student);
        totalStudentsAdded++;
        System.out.println("Student added successfully: " + student.getName());
    }

    // Remove a student by ID
    public boolean removeStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student removed: " + student.getName());
            return true;
        }
        System.out.println("Student not found with ID: " + studentId);
        return false;
    }

    // Find student by ID
    public Student findStudentById(String studentId) {
        for (Student s : studentList) {   // forEach loop
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    // Update student marks
    public void updateMarks(String studentId, double newMarks) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.setMarks(newMarks);
            System.out.println("Marks updated for " + student.getName() + " -> " + newMarks);
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }

    // Display all students - uses POLYMORPHISM (display() from Displayable interface)
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n========== ALL STUDENTS ==========");
        for (Student s : studentList) {
            s.display();  // Polymorphic call
        }
        System.out.println("Total: " + studentList.size() + " student(s)");
        System.out.println("==================================\n");
    }

    // Display students by course
    public void displayByCourse(String course) {
        System.out.println("\n--- Students in course: " + course + " ---");
        boolean found = false;
        for (Student s : studentList) {
            if (s.getCourse().equalsIgnoreCase(course)) {
                s.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found in course: " + course);
        }
    }

    // Display topper (highest marks)
    public void displayTopper() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Student topper = studentList.get(0);
        for (Student s : studentList) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        System.out.println("\n--- Class Topper ---");
        topper.displayInfo();
    }

    // Get total number of students
    public int getTotalStudents() {
        return studentList.size();
    }

    // Count passed students
    public void displayPassFailCount() {
        int passed = 0, failed = 0;
        for (Student s : studentList) {
            if (s.isPassed(s.getMarks())) passed++;
            else failed++;
        }
        System.out.println("\n--- Pass/Fail Summary ---");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total : " + studentList.size());
    }
}
