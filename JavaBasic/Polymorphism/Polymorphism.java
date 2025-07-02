// Polymorphism means "many forms". It allows the same method or function name to 
// behave differently based on the object that is calling it.

// 💡 Key Concept of Polymorphism:
//  |->code reusability, 
//  |->flexibility
//  |->extensibility

// 🔸 Types of Polymorphism:
//  |-> 1. Compile-Time Polymorphism (Static Binding)
//      |->1. Overloading
// 
//  |-> 2. Run-Time Polymorphism (Dynamic Binding)
//      |->1. Overriding

package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        // methods with the same name but different parameter types
        Overloading overloading = new Overloading();
        overloading.case1();
        overloading.case2();
        overloading.case3();
        overloading.case4();
        overloading.case5();

        // methods and parameter are same name in superclass but extend different subclass
        Overriding overriding = new Overriding();
        overriding.case1();
        overriding.case2();
        overriding.case3();
        overriding.case4();

    }
}
