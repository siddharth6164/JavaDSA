// Hierarchical Inheritance means multiple classes inherit from a single parent class. 
// It’s like one base class has many child classes.
// 📘 Structure:
//      Animal
//      /    \
//    Dog     Cat

package Inheritance;

class Parent {
    void parent_propertie1() {
        System.out.println("Only Child1 access the Parent Propertie1");
    }

    void parent_propertie2() {
        System.out.println("Only Child2 access the Parent Propertie2");
    }
}

class Child1 extends Parent {
    void child1_propertie() {
        System.out.println("Child1 Propertie");
    }
}

class Child2 extends Parent {
    void child2_propertie() {
        System.out.println("Child2 Propertie");
    }
}

class HierarchicalInheritance {
    void callhierarchical() {
        System.out.println("Child1 access the Parent Properties");
        Child1 child1 = new Child1();
        child1.child1_propertie();
        child1.parent_propertie1();

        System.out.println("Child2 access the Parent Properties");
        Child2 child2 = new Child2();
        child2.child2_propertie();
        child2.parent_propertie2();
    }

}
