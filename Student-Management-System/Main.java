import java.util.ArrayList;
import java.util.List;

/**
 * Main class - Entry point of the Student Management System
 * Demonstrates all OOP concepts in action:
 * - Creating and using objects
 * - Polymorphism with interface and inheritance
 * - Encapsulation through getters/setters
 * - Abstraction through abstract class and interface
 * - Inheritance through class hierarchy
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("=======================================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM - OOP DEMONSTRATION     ");
        System.out.println("=======================================================\n");
        
        // ============================================================
        // DEMONSTRATION OF ABSTRACTION
        // ============================================================
        System.out.println(">>> ABSTRACTION: Using abstract class Person and interface GradeCalculator\n");
        
        // Create Course objects (demonstrating encapsulation)
        Course javaCourse = new Course("CS101", "Introduction to Java Programming", 4, "Dr. Smith");
        Course pythonCourse = new Course("CS102", "Python for Data Science", 3, "Prof. Johnson");
        Course webCourse = new Course("CS201", "Web Development", 3, "Ms. Williams");
        
        // ============================================================
        // DEMONSTRATION OF ENCAPSULATION
        // ============================================================
        System.out.println(">>> ENCAPSULATION: Private attributes with getters/setters\n");
        
        // Create Student object using constructor
        Student student1 = new Student("Alice Johnson", 20, 85, javaCourse);
        
        // Use setters to modify values (encapsulation)
        student1.setName("Alice Marie Johnson");
        student1.setMarks(92);
        
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Marks: " + student1.getMarks());
        System.out.println("Grade: " + student1.getGrade());
        
        // ============================================================
        // DEMONSTRATION OF INHERITANCE
        // ============================================================
        System.out.println("\n>>> INHERITANCE: Student extends Person\n");
        
        // Create another student - demonstrates inheritance from Person
        Student student2 = new Student("Bob Smith", 22, 67, pythonCourse);
        
        // Using inherited methods from Person
        System.out.println("Using inherited greet() method:");
        student2.greet();
        
        // ============================================================
        // DEMONSTRATION OF POLYMORPHISM
        // ============================================================
        System.out.println("\n>>> POLYMORPHISM: Method overriding and interface implementation\n");
        
        // Array of Person objects - demonstrates polymorphism
        // A Student IS-A Person, so can be stored in Person array
        Person[] people = {
            student1,
            student2,
            new UndergraduateStudent("Charlie Brown", 19, 78, webCourse, "Freshman", "Computer Science")
        };
        
        // Polymorphic method calls - displayDetails() behaves differently
        // based on the actual object type
        System.out.println("\nCalling displayDetails() polymorphically:");
        for (Person person : people) {
            person.displayDetails(); // Same method call, different behavior
        }
        
        // Polymorphism through interface
        System.out.println("\n>>> POLYMORPHISM: Using GradeCalculator interface\n");
        GradeCalculator calculator = student1;
        System.out.println("Grade via interface: " + calculator.calculateGrade(85));
        System.out.println("Grade Point via interface: " + calculator.getGradePoint(85));
        System.out.println("Is Passing: " + calculator.isPassing(85));
        
        // ============================================================
        // DEMONSTRATION OF COMPOSITION AND MORE ENCAPSULATION
        // ============================================================
        System.out.println("\n>>> COMPOSITION: Student HAS-A Course\n");
        
        // Demonstrate course relationship
        System.out.println("Student 1's Course: " + student1.getCourse().getCourseName());
        System.out.println("Instructor: " + student1.getCourse().getInstructor());
        
        // ============================================================
        // CREATING A LIST OF STUDENTS
        // ============================================================
        System.out.println("\n>>> COLLECTIONS: Managing multiple students\n");
        
        List<Student> studentList = new ArrayList<>();
        
        // Add more students
        studentList.add(new Student("Diana Prince", 21, 95, javaCourse));
        studentList.add(new Student("Edward Norton", 23, 45, pythonCourse));
        studentList.add(new Student("Fiona Green", 20, 72, webCourse));
        studentList.add(new UndergraduateStudent("George Harris", 19, 88, javaCourse, "Sophomore", "Software Engineering"));
        
        // Display all students
        System.out.println("All Students in the System:");
        System.out.println("-".repeat(50));
        for (Student s : studentList) {
            System.out.println(s); // Uses toString() method
        }
        
        // ============================================================
        // DEMONSTRATE CALCULATIONS
        // ============================================================
        System.out.println("\n>>> GRADE CALCULATIONS\n");
        
        int[] testMarks = {95, 85, 75, 65, 55, 45, 35};
        String[] expectedGrades = {"A+", "A", "B+", "B", "C", "D", "F"};
        
        System.out.println("Marks | Grade | Grade Point | Status");
        System.out.println("-".repeat(45));
        for (int i = 0; i < testMarks.length; i++) {
            System.out.printf("%5d | %5s | %12.1f | %s%n", 
                testMarks[i], 
                student1.calculateGrade(testMarks[i]),
                student1.getGradePoint(testMarks[i]),
                student1.isPassing(testMarks[i]) ? "PASSED" : "FAILED"
            );
        }
        
        // ============================================================
        // FINAL SUMMARY
        // ============================================================
        System.out.println("\n=======================================================");
        System.out.println("   OOP CONCEPTS DEMONSTRATED IN THIS SYSTEM:");
        System.out.println("=======================================================");
        System.out.println("1. ABSTRACTION:");
        System.out.println("   - Abstract class Person (cannot be instantiated)");
        System.out.println("   - Interface GradeCalculator (defines contract)");
        System.out.println("");
        System.out.println("2. ENCAPSULATION:");
        System.out.println("   - Private attributes with public getters/setters");
        System.out.println("   - Data hiding and protection");
        System.out.println("");
        System.out.println("3. INHERITANCE:");
        System.out.println("   - Student extends Person");
        System.out.println("   - UndergraduateStudent extends Student");
        System.out.println("");
        System.out.println("4. POLYMORPHISM:");
        System.out.println("   - Method overriding (displayDetails(), greet())");
        System.out.println("   - Interface implementation (GradeCalculator)");
        System.out.println("   - Same method call, different behavior");
        System.out.println("=======================================================");
        
        System.out.println("\n>>> System execution completed successfully! <<<");
    }
}
