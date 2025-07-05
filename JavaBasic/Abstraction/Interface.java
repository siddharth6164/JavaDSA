// Interface is a reference type (like a class) that defines a contract — a set of method signatures (without bodies) 
// that implementing classes must follow.
// It is used to achieve abstraction and multiple inheritance of type.


// ✅ Key Characteristics
// No method body (except default, static, and private methods from Java 8+)
// All methods are implicitly public and abstract
// All fields are public static final (constants)
// A class uses the "implements" keyword to adopt an interface

package Abstraction;

// Basic Abstraction
interface A {
    public void a();
}
class MyClass implements A {
    public void a(){}
}

public class Interface{
    void caseone(){
        //--------------------- Basic Abstraction ---------------------
        MyClass 
    }
}