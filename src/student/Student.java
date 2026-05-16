package student;

// Student class INHERITS from Person - demonstrates INHERITANCE
// Also IMPLEMENTS two interfaces - demonstrates INTERFACES
public class Student extends Person implements Displayable, Gradable {

    // Student-specific private fields - ENCAPSULATION
    private String studentId;
    private String course;
    private double marks;

    // Constructor with all fields - demonstrates CONSTRUCTORS
    public Student(String studentId, String name, int age, String email, String course, double marks) {
        // Call parent constructor using super() - part of INHERITANCE
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Constructor without marks (overloaded constructor) - demonstrates CONSTRUCTORS
    public Student(String studentId, String name, int age, String email, String course) {
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
        this.marks = 0.0;
    }

    // Getters and Setters - ENCAPSULATION
    public String getStudentId() {

        return studentId;
    }

    public void setStudentId(String studentId) {

        this.studentId = studentId;
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {

        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Implementing abstract method from Person - demonstrates POLYMORPHISM
    @Override
    public void displayInfo() {
        System.out.println("====== STUDENT INFO ======");
        System.out.println("Student ID : " + studentId);
        System.out.println(getBasicInfo());
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade(marks));
        System.out.println("Status     : " + (isPassed(marks) ? "PASSED" : "FAILED"));
        System.out.println("==========================");
    }

    // Implementing interface method from Displayable - INTERFACES
    @Override
    public void display() {
        System.out.println("[" + studentId + "] " + getName() + " | " + course + " | Marks: " + marks + " | Grade: " + calculateGrade(marks));
    }

    // Implementing interface method from Displayable - INTERFACES
    @Override
    public String getSummary() {
        return "Student{ID=" + studentId + ", Name=" + getName() + ", Course=" + course + ", Grade=" + calculateGrade(marks) + "}";
    }

    // Implementing interface method from Gradable - INTERFACES
    @Override
    public String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Implementing interface method from Gradable - INTERFACES
    @Override
    public boolean isPassed(double marks) {
        return marks >= 50;
    }
}
