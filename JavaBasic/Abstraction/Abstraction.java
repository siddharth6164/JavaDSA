// Hiding internal details and showing only essential features.
// java provide the 2 way to implement abstraction:
// 1. Abstract class    |->Partially abstract
// 2. Inteface          |->Fully abstract
package Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        // 1. Abstract class
        Abstractclass abstractclass = new Abstractclass();
        abstractclass.caseone();

        // 2. Inteface
        Interface interFace = new Interface();
        interFace.caseone();
        interFace.casetow();
        interFace.casethree();
        interFace.casefour();
        interFace.casefive();
    }
}