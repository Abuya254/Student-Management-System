# Student Management System - Design Explanation

## 1. Overview

This Student Management System is designed using Object-Oriented Programming (OOP) principles in Java. It provides functionality to create student objects, store their details, calculate grades, and display comprehensive student information.

## 2. Class Design

### 2.1 Class Hierarchy

```
Person (Abstract Class)
    |
    └── Student (Concrete Class)
            |
            └── UndergraduateStudent (Concrete Class)
```

### 2.2 Classes and Their Responsibilities

| Class | Type | Purpose |
|-------|------|---------|
| Person | Abstract Class | Base class defining common attributes (name, age) and abstract method displayDetails() |
| Student | Concrete Class | Core entity storing student ID, marks, course; implements grade calculation |
| Course | Class | Encapsulates course information (code, name, credits, instructor) |
| GradeCalculator | Interface | Defines contract for grade calculation methods |
| UndergraduateStudent | Class | Specialized student with year level and major |
| Main | Class | Application entry point demonstrating system functionality |

## 3. OOP Concepts Demonstrated

### 3.1 Abstraction
- **Abstract Class Person**: Cannot be instantiated; serves as a blueprint for subclasses
- **Interface GradeCalculator**: Defines abstract methods (calculateGrade, getGradePoint, isPassing) without implementation

### 3.2 Encapsulation
- **Private Attributes**: All data fields are private (e.g., studentId, marks, course)
- **Getters and Setters**: Public methods provide controlled access to private data
- **Data Validation**: Setters include validation (e.g., marks must be 0-100)

### 3.3 Inheritance
- **Student extends Person**: Reuses name, age attributes and greet() method
- **UndergraduateStudent extends Student**: Adds yearLevel and major fields
- **Multi-level Inheritance**: Demonstrates inheritance chain

### 3.4 Polymorphism
- **Method Overriding**: 
  - Student overrides displayDetails() from Person
  - UndergraduateStudent overrides displayDetails() from Student
- **Interface Implementation**: Student implements GradeCalculator interface
- **Dynamic Binding**: Same method call produces different results based on object type

## 4. Key Features

### 4.1 Grade Calculation
The system calculates grades based on marks:
- A+: 90-100 (4.0 GP)
- A: 80-89 (4.0 GP)
- B+: 70-79 (3.5 GP)
- B: 60-69 (3.0 GP)
- C: 50-59 (2.5 GP)
- D: 40-49 (2.0 GP)
- F: 0-39 (0.0 GP)

### 4.2 Data Storage
- Student objects stored in ArrayList for dynamic management
- Static counter generates unique student IDs

## 5. Design Benefits

1. **Reusability**: Inheritance reduces code duplication
2. **Maintainability**: Encapsulation protects data integrity
3. **Flexibility**: Polymorphism allows treating different object types uniformly
4. **Extensibility**: New student types can be added via inheritance

## 6. Conclusion

This system successfully demonstrates all four pillars of Object-Oriented Programming while fulfilling the functional requirements of capturing student data, calculating grades, and displaying comprehensive student information.
