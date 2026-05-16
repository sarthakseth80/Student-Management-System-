# Student Management System
### A Java Mini Project covering Week 2 - OOP Concepts

---

## Project Structure

```
StudentManagementSystem/
└── src/
    └── student/
        ├── Person.java          --> Abstract Class (Abstraction + Encapsulation)
        ├── Displayable.java     --> Interface
        ├── Gradable.java        --> Interface
        ├── Student.java         --> Inherits Person, Implements both Interfaces
        ├── Teacher.java         --> Inherits Person, Implements Displayable
        ├── StudentManager.java  --> Manages Student objects (CRUD operations)
        └── Main.java            --> Entry point with menu-driven program
```

---

## OOP Concepts Covered

| Concept              | Where Used                                                    |
|----------------------|---------------------------------------------------------------|
| Classes & Objects    | All .java files — Person, Student, Teacher, StudentManager    |
| Constructors         | Every class has constructors; Student has 2 (overloaded)      |
| Inheritance          | Student extends Person, Teacher extends Person                |
| Polymorphism         | displayInfo() works differently for Student vs Teacher        |
| Abstraction          | Person is abstract; has abstract method displayInfo()         |
| Encapsulation        | All fields are private; accessed via getters/setters          |
| Interfaces           | Displayable and Gradable interfaces implemented by Student    |
| Abstract Classes     | Person class is abstract                                      |

---

## How to Run

### Option 1: Command Line
```bash
# Step 1: Go to the src folder
cd StudentManagementSystem/src

# Step 2: Compile all files
javac student/*.java

# Step 3: Run the program
java student.Main
```

### Option 2: IntelliJ IDEA / Eclipse
1. Open the project folder
2. Set `src` as the Sources Root
3. Run `Main.java`

---

## Features

- Add a new student
- View all students
- Search student by ID
- Update student marks
- Remove a student
- Filter students by course
- Show class topper
- Show pass/fail summary

---

## Grade Scale

| Marks  | Grade |
|--------|-------|
| 90-100 | A+    |
| 80-89  | A     |
| 70-79  | B     |
| 60-69  | C     |
| 50-59  | D     |
| Below 50 | F  |

---

*Made with basic OOP concepts — no advanced features used intentionally.*
