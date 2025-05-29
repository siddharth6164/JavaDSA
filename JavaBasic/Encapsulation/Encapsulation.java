package Encapsulation;
// Encapsulation

// -> Bundling of data and method into a single unit.
// -> usually a class and restricting direct access to object.
// -> this is typically achieved using-
//      |-> 1. Private variable
//      |-> 2. Public getter and setter method

// Types of Encapsulation
// 1->  Member-Level Encapsulation
// 2->  Class-Level Encapsulation
// 3->  Package-Level Encapsulation
// 4->  Inheritance-Based Encapsulation

public class Encapsulation {
    public static void main(String[] args) {

        /*-----------------------> 1. Member Level Encapsulation <-----------------------*/
        // Creating object of User
        MemberEncapsulation user = new MemberEncapsulation();
        // Setting values using setters
        user.setUsername("siddhu33singh");
        user.setPassword("123"); // Invalid (too short)
        user.setPassword("123456"); // Valid
        // Getting values using getters
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        /*-----------------------> 2. Class Level Encapsulation <-----------------------*/
        // Creating object of Person
        ClassEncapsulation person = new ClassEncapsulation("John Doe", 25);
        person.displayInfo();
        person.setAge(-10);
        person.getAge();

        /*-----------------------> 3.Package Level Encapsulation <-----------------------*/
        PackageEncapsulation obj = new PackageEncapsulation();
        obj.showData(); // Works because it's in same package

        /*-----------------------> 4.Inheritance Based Encapsulation <-----------------------*/

        InheritanceEncapsulation child = new InheritanceEncapsulation();
        child.accessProtectedData();
    }
}
