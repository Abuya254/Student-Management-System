/**
 * Student class - Demonstrates INHERITANCE, ENCAPSULATION, and POLYMORPHISM
 * 
 * INHERITANCE: Extends Person class (Student IS-A Person)
 * ENCAPSULATION: Private attributes with public getters/setters
 * POLYMORPHISM: Implements GradeCalculator interface and overrides displayDetails()
 */
public class Student extends Person implements GradeCalculator {
    
    // Protected attributes - accessible to subclasses (ENCAPSULATION variant)
    protected int studentId;
    protected int marks;
    protected Course course;
    protected String enrollmentDate;
    
    // Static counter to generate unique student IDs
    private static int idCounter = 1000;
    
    // Default constructor
    public Student() {
        super("", 0);
    }
    
    // Parameterized constructor
    public Student(String name, int age, int marks, Course course) {
        super(name, age);
        this.studentId = ++idCounter;
        this.marks = marks;
        this.course = course;
        this.enrollmentDate = "2024-01-15"; // Default enrollment date
    }
    
    // Constructor with all parameters including custom student ID
    public Student(int studentId, String name, int age, int marks, Course course, String enrollmentDate) {
        super(name, age);
        this.studentId = studentId;
        this.marks = marks;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }
    
    // Getters and Setters - Demonstrates ENCAPSULATION
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public int getMarks() {
        return marks;
    }
    
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            this.marks = 0;
        }
    }
    
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public String getEnrollmentDate() {
        return enrollmentDate;
    }
    
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    
    // Implementation of GradeCalculator interface methods - Demonstrates POLYMORPHISM
    @Override
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }
    
    @Override
    public double getGradePoint(int marks) {
        if (marks >= 90) return 4.0;
        else if (marks >= 80) return 4.0;
        else if (marks >= 70) return 3.5;
        else if (marks >= 60) return 3.0;
        else if (marks >= 50) return 2.5;
        else if (marks >= 40) return 2.0;
        else return 0.0;
    }
    
    @Override
    public boolean isPassing(int marks) {
        return marks >= 50;
    }
    
    // Get grade using instance marks
    public String getGrade() {
        return calculateGrade(this.marks);
    }
    
    // Get grade point using instance marks
    public double getGradePoint() {
        return getGradePoint(this.marks);
    }
    
    // Check if passing using instance marks
    public boolean isPassing() {
        return isPassing(this.marks);
    }
    
    // Override displayDetails() from Person - Demonstrates POLYMORPHISM
    @Override
    public void displayDetails() {
        System.out.println("\n========== STUDENT DETAILS ==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("Grade Point: " + getGradePoint());
        System.out.println("Status: " + (isPassing() ? "PASSED" : "FAILED"));
        if (course != null) {
            System.out.println("\n--- Course Information ---");
            course.displayCourseInfo();
        }
        System.out.println("=====================================");
    }
    
    // Override greet() method from Person - Demonstrates POLYMORPHISM
    @Override
    public void greet() {
        System.out.println("Hello, I'm student " + name + " with ID: " + studentId);
    }
    
    // Static method to get current ID counter
    public static int getIdCounter() {
        return idCounter;
    }
    
    // Override toString method
    @Override
    public String toString() {
        return "Student[ID=" + studentId + ", Name=" + name + ", Grade=" + getGrade() + "]";
    }
}
