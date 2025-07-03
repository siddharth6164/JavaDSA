// Case1: Declaring an Abstract Class and method
// Case2: Cannot create the obejct of Abstract Class
// Case3: We Can create Constructors of Abstract Class
// Case4: we Can Have Both Abstract and Concrete Methods
// Case5: we Can Have Fields and State (int speed);
// Case6: we Can Extend Another Class or Abstract Class

package Abstraction;

abstract class Parent {
    Parent(){
        System.out.println("Constructors");
    }
    abstract void m1();

    void m2() {
        System.out.println("m2");
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("Abstraction method provid the body/function");
    }
}

public class Abstractclass {
    void caseone() {
        Child case1 = new Child();
        case1.m1();
    }
}