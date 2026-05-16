package student;

// Teacher also INHERITS from Person - demonstrates INHERITANCE
// Shows POLYMORPHISM: same abstract method, different implementation
public class Teacher extends Person implements Displayable {

    // Teacher-specific private fields - ENCAPSULATION
    private String teacherId;
    private String subject;

    // Constructor - demonstrates CONSTRUCTORS
    public Teacher(String teacherId, String name, int age, String email, String subject) {
        // Call parent constructor - INHERITANCE
        super(name, age, email);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    // Getters and Setters - ENCAPSULATION
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Implementing abstract method differently than Student - demonstrates POLYMORPHISM
    @Override
    public void displayInfo() {
        System.out.println("====== TEACHER INFO ======");
        System.out.println("Teacher ID : " + teacherId);
        System.out.println(getBasicInfo());
        System.out.println("Subject    : " + subject);
        System.out.println("==========================");
    }

    // Implementing Displayable interface - INTERFACES
    @Override
    public void display() {
        System.out.println("[" + teacherId + "] " + getName() + " | Subject: " + subject);
    }

    // Implementing Displayable interface - INTERFACES
    @Override
    public String getSummary() {
        return "Teacher{ID=" + teacherId + ", Name=" + getName() + ", Subject=" + subject + "}";
    }
}
