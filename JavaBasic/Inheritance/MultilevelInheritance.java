// Multilevel Inheritance is a type of inheritance where a class is derived from a class which is already derived from another class.
// 📘 Structure:
// Class A → Class B → Class C


package Inheritance;
class Parent{
    void parent_propertie(){
        System.out.println("Parent Propertie");
    }
}

class Child1 extends Parent{
    void child1_propertie(){
        System.out.println("Child1 Propertie");
    }
}
class MultilevelInheritance extends Child1{
    void child2_propertie(){
        System.out.println("Child2 Propertie");
    }
}
