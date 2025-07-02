// Method overriding occurs when a subclass defines a method with the same name, return type, 
// and parameters as a method in its superclass, but with a different implementation.

package Polymorphism;

// ---------------------------- Case 1 ----------------------------
class CaseoneParent {
    void m1() {
        System.out.println("Parent Method");
    }
}

class CaseoneChild extends CaseoneParent {
    void m1() {
        System.out.println("Child Method");
    }
}

// ---------------------------- Case 2 ----------------------------
class CaseReturnTypeParent {
    public Object m1() {
        return "Object";
    }
}

class CaseReturnTypeChild extends CaseReturnTypeParent {
    public String m1() {
        return "String";
    }
}

// ---------------------------- Case 3 ----------------------------
// ---------------------------- Private ----------------------------
// It is vaild but not overriding and not access. It is access only it self
// class.
class CasePrivateParent {
    private void m1() {
        System.out.println("Private Parent");
    }
}

class CasePrivateChild extends CasePrivateParent {
    private void m1() {
    }
}

// ----------------------------------- Final -----------------------------------
// Parent class fincal method we can't override in the child class but we can
// access.
class CaseFinalParent {
    final void m1() {
    }
}

class CaseFinalChild extends CaseFinalParent {
    // public void m1(){} //❌ it can not override but it can be access this method
}

// ---------------------------- Abstract ----------------------------
// we should override parent class abstract method in child class to provide
// implementation.
abstract class CaseAbstractParent {
    public abstract void m1();
}

class CaseAbstractChild extends CaseAbstractParent {
    public void m1() {
        System.out.println("Abstract method");
    }
}

// ---------------------------- Static ----------------------------
class CaseStaticParent {
    public static void m1() {
        System.out.println("Static Parent");
    }
}

class CaseStaticChild extends CaseStaticParent {
    public static void m1() {
        System.out.println("Static Child");
    }
}

public class Overriding {
    void case1() {
        CaseoneChild statisfed = new CaseoneChild();
        statisfed.m1();
    }

    void case2() {
        CaseReturnTypeChild returnType = new CaseReturnTypeChild();
        System.out.println(returnType.m1());
    }

    void case3() {
        // access modifer-->private/final/abstract
        // ------------------- Private -------------------
        CasePrivateChild modiferPrivate = new CasePrivateChild();
        // modiferPrivate.m1(); //❌ we cannot access private method.

        // ------------------- Final -------------------
        CaseFinalChild modiferfinal = new CaseFinalChild();
        modiferfinal.m1();

        // ------------------- Abstract -------------------
        CaseAbstractChild modiferAbstract = new CaseAbstractChild();
        modiferAbstract.m1();

    }

    void case4() {
        // static and non-static
        // @MethodHinding
        CaseStaticChild modiferStatic = new CaseStaticChild();
        modiferStatic.m1();
    }
}