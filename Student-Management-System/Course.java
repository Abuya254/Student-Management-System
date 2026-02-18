/**
 * Course class - Demonstrates ENCAPSULATION
 * This class encapsulates course information with private attributes and public getters/setters.
 */
public class Course {
    
    // Private attributes - Demonstrates ENCAPSULATION
    private String courseCode;
    private String courseName;
    private int creditHours;
    private String instructor;
    
    // Default constructor
    public Course() {
    }
    
    // Parameterized constructor
    public Course(String courseCode, String courseName, int creditHours, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
    }
    
    // Getters and Setters - Demonstrates ENCAPSULATION
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public int getCreditHours() {
        return creditHours;
    }
    
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("  Course Code: " + courseCode);
        System.out.println("  Course Name: " + courseName);
        System.out.println("  Credit Hours: " + creditHours);
        System.out.println("  Instructor: " + instructor);
    }
    
    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
