// Single Inheritance means a child class inherits the properties and methods of a single parent class.
// This allows code reuse and supports the concept of hierarchical classification.

package Inheritance;

// Parent class
class Parent {
    void parent_propertie() {
        System.out.println("Parent propertie");
    }
}

// Child class
class SingleInheritance extends Parent {
    void child_propertie() {
        System.out.println("Child propertie");
    }
}