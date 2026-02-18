/**
 * GradeCalculator Interface - Demonstrates ABSTRACTION
 * This interface defines a contract for calculating grades.
 * Classes implementing this interface must provide their own implementation.
 */
public interface GradeCalculator {
    
    /**
     * Calculate grade based on marks
     * @param marks The numeric marks/points
     * @return The calculated grade as a String
     */
    String calculateGrade(int marks);
    
    /**
     * Get the grade point value
     * @param marks The numeric marks/points
     * @return The grade point value
     */
    double getGradePoint(int marks);
    
    /**
     * Check if the student passed
     * @param marks The numeric marks/points
     * @return true if passed, false otherwise
     */
    boolean isPassing(int marks);
}
