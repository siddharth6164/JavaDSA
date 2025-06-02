// Key Points:
// Resolved during compile time.
// Achieved by defining multiple methods with the same name but different parameter types, number of parameters, or both.

package Polymorphism;

class Caseone {
    void m1(int i) {
        System.out.println(i);
    }

    void m1(int i, int j) {
        System.out.println(i + " " + j);
    }

}

class CaseTwo {
    void m1(String s) {
        System.out.println("String " + s);
    }

    void m1(Object s) {
        System.out.println("Object " + s);
    }
}

class CaseThree {
    void m1(String s) {
        System.out.println("String " + s);
    }

    void m1(StringBuffer s) {
        System.out.println("StringBuffer " + s);
    }
}

class CaseFour {
    void m1(int a, float b) {
        System.out.println("int " + "float");
    }

    void m1(float a, int b) {
        System.out.println("float " + "int");
    }

    void m1(int a, int b) {
        System.out.println("int " + "int");
    }
}

class CaseFive {
    void m1(int i) {
        System.out.println("int parameter");
    }

    void m1(int... i) {
        System.out.println("int arg parameter");
    }
}

public class Overloading {
    void case1() {
        Caseone caseOne = new Caseone();
        caseOne.m1(100);
        caseOne.m1(100, 200);
    }

    void case2() {
        // new Object()_________ ✅__ Default constructor exists
        // new Object("java")___ ❌__ No such constructor in Object class
        // new String("java")___ ✅__ String class has such a constructor
        // Object obj = "java";_ ✅__ Implicit upcasting
        CaseTwo caseTwo = new CaseTwo();
        caseTwo.m1("Siddharth");
        caseTwo.m1(new Object());
        caseTwo.m1(null);
    }

    void case3() {
        CaseThree caseThree = new CaseThree();
        caseThree.m1("Siddharth");
        caseThree.m1(new StringBuffer());

        // caseThree.m1(null);
        // |-> null is valid for both String and StringBuffer, since both are reference
        // types.
        // |-> Java cannot decide which overloaded method to call, because both are
        // equally specific.
    }

    void case4() {
        CaseFour caseFour = new CaseFour();
        caseFour.m1(10, 10);
        caseFour.m1(10, 10L);
        // caseFour.m1(10, 10.0); //a->int b-> default set double
        caseFour.m1(10, 10.0f);
    }

    void case5() {
        CaseFive caseFive = new CaseFive();
        caseFive.m1(1);
        caseFive.m1(1, 2, 3, 4, 5);
    }
}
