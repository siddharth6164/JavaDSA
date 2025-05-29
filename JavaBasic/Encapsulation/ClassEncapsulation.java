// Class Level Encapsulation
// Class-level encapsulation means:
// |-> The entire class's data (fields) is made private.
// |-> Access to those fields is only allowed through public getter and setter methods.
// |-> It ensures data hiding, security, and controlled access to the class’s internal state.

// 🧠 Why Use It?
// |->Protects internal data from direct modification.
// |->Allows validation before data changes.
// |->Makes code easier to maintain and debug.
package Encapsulation;

public class ClassEncapsulation {
    // Private fields - cannot be accessed directly outside the class
    private String name;
    private int age;

    // Constructor to initialize the object
    public ClassEncapsulation(String name, int age) {
        this.name = name;
        setAge(age); // using setter for validation
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }

    // Method to display object info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
