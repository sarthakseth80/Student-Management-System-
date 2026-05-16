package student;

// Abstract class - demonstrates ABSTRACTION
public abstract class Person {

    // Private fields - demonstrates ENCAPSULATION
    private String name;
    private int age;
    private String email;

    // Constructor - demonstrates CONSTRUCTORS
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters - part of ENCAPSULATION
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Abstract method - every subclass MUST implement this (ABSTRACTION)
    public abstract void displayInfo();

    // Common method available to all subclasses
    public String getBasicInfo() {
        return "Name: " + name + " | Age: " + age + " | Email: " + email;
    }
}
