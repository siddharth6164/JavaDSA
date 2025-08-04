// Inheritance allows one class (called a child class or subclass) to inherit properties and behaviors 
// (fields and methods) from another class (called a parent class or superclass).
// 💡 Key Concept of Inheritance:
// |-> Code reusability
// |-> method overriding

// USE ->"extends" keyword is used for inheritance in Java.

// 📘 Types of Inheritance:
// |-> 1. Single Inheritance
// |-> 2. Multilevel Inheritance
// |-> 3. Hierarchical Inheritance

package Inheritance;
public class Inheritance {
    public static void main(String[] args) {
        /*-----------------------> 1. Single Inheritance  <-----------------------*/
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.child_propertie();
        singleInheritance.parent_propertie();

        /*-----------------------> 2. Multilevel Inheritance  <-----------------------*/
        MultilevelInheritance multilevelInheritance = new MultilevelInheritance();
        multilevelInheritance.child2_propertie();
        multilevelInheritance.child1_propertie();
        multilevelInheritance.parent_propertie();

        /*-----------------------> 3. Hierarchical Inheritance  <-----------------------*/
        HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
        hierarchicalInheritance.callhierarchical();


    }
}