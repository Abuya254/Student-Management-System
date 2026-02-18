/**
 * UndergraduateStudent class - Demonstrates further INHERITANCE and POLYMORPHISM
 * Extends Student class to show multi-level inheritance
 */
public class UndergraduateStudent extends Student {
    
    private String yearLevel;
    private String major;
    
    // Default constructor
    public UndergraduateStudent() {
        super();
    }
    
    // Parameterized constructor
    public UndergraduateStudent(String name, int age, int marks, Course course, String yearLevel, String major) {
        super(name, age, marks, course);
        this.yearLevel = yearLevel;
        this.major = major;
    }
    
    // Full parameter constructor
    public UndergraduateStudent(int studentId, String name, int age, int marks, Course course, 
                                 String enrollmentDate, String yearLevel, String major) {
        super(studentId, name, age, marks, course, enrollmentDate);
        this.yearLevel = yearLevel;
        this.major = major;
    }
    
    // Getters and Setters
    public String getYearLevel() {
        return yearLevel;
    }
    
    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    // Override displayDetails() - Demonstrates POLYMORPHISM
    @Override
    public void displayDetails() {
        System.out.println("\n========== UNDERGRADUATE STUDENT DETAILS ==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Major: " + major);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("Grade Point: " + getGradePoint());
        System.out.println("Status: " + (isPassing() ? "PASSED" : "FAILED"));
        if (course != null) {
            System.out.println("\n--- Course Information ---");
            course.displayCourseInfo();
        }
        System.out.println("===================================================");
    }
    
    // Additional method specific to UndergraduateStudent
    public void displayYearInfo() {
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Major: " + major);
    }
}
