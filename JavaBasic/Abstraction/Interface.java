// Interface is a reference type (like a class) that defines a contract — a set of method signatures (without bodies) 
// that implementing classes must follow.
// It is used to achieve abstraction and multiple inheritance of type.

// ✅ Key Characteristics
// No method body (except default, static, and private methods from Java 8+)
// All methods are implicitly public and abstract
// All fields are public static final (constants)
// A class uses the "implements" keyword to adopt an interface

package Abstraction;

//--------------------- CASE 1 ---------------------
interface CaseoneA {
    public void m1();
}

class Caseone implements CaseoneA {
    public void m1() {
        System.out.println("Basic Abstraction with interface");
    }
}

// --------------------- CASE 2 ---------------------
interface CasetowA {
    public void m1();
}

interface CasetowB {
    public void m2();
}

class Casetow implements CaseoneA, CasetowB {
    public void m1() {
        System.out.println("Case Tow A");
    };

    public void m2() {
        System.out.println("Case Tow B");
    };
}

// --------------------- CASE 3 ---------------------
@FunctionalInterface
interface CaseThree {
    int m1(int a, int b);
}

// --------------------- CASE 4 ---------------------
interface Serializable {
    /* No methods – it's a marker interface */}

interface Cloneable {
    /* No methods — it's a marker interface */}

class Casefour implements Serializable, Cloneable {
    // |-> Serializable
    // |-> Cloneable
}

// --------------------- CASE 5 ---------------------
interface CasefiveA {
    // override is possible to implement
    default void m1() {
        System.out.println("Hello from default method");
    }
}

class Casefive implements CasefiveA {
}

public class Interface {
    void caseone() {
        // --------------------- Basic Abstraction ---------------------
        Caseone interface1 = new Caseone();
        interface1.m1();
    }

    void casetow() {
        // --------------------- Multiple Interfaces---------------------
        Casetow interface2 = new Casetow();
        interface2.m1();
        interface2.m2();
    }

    void casethree() {
        // --------------------- Functional Interfaces ---------------------
        // An interface with exactly one abstract method – can be used with lambda
        // expressions.
        CaseThree addition = (a, b) -> a + b;
        CaseThree subtractuin = (a, b) -> a - b;
        CaseThree multiplication = (a, b) -> a * b;
        CaseThree division = (a, b) -> a / b;
        System.out.println("Addition : " + addition.m1(10, 20));
        System.out.println("Subtraction : " + subtractuin.m1(20, 10));
        System.out.println("Multiplication: " + multiplication.m1(10, 5));
        System.out.println("Division: " + division.m1(10, 5));
    }

    void casefour() {
        // --------------------- Marker Interfaces---------------------
        // An interface with no methods
        Casefour interface4 = new Casefour();
    }

    void casefive() {
        Casefive interface5 = new Casefive();
        interface5.m1();
    }
}