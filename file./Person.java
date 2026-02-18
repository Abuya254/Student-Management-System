/**
 * Abstract class Person - Demonstrates ABSTRACTION
 * This is an abstract base class that defines common attributes for all persons.
 * It cannot be instantiated directly and requires subclasses to implement abstract methods.
 */
public abstract class Person {
    
    // Protected attribute - accessible to subclasses (encapsulation variant)
    protected String name;
    protected int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and Setters - Demonstrates ENCAPSULATION
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
    
    // Abstract method - must be implemented by subclasses
    // Demonstrates ABSTRACTION - defining contract without implementation
    public abstract void displayDetails();
    
    // Concrete method with default implementation
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}
