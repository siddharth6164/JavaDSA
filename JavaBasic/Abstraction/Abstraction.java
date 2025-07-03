// Hiding internal details and showing only essential features.
// java provide the 2 way to implement abstraction:
// 1. Abstract class    |->Partially abstract
// 2. Inteface          |->Fully abstract
package Abstraction;

abstract class Parent {
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

public class Abstraction {
    public static void main(String[] args) {
        Child abs = new Child();
        abs.m1();
    }
}