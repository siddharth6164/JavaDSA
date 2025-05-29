//  Package-Level Encapsulation, class members (fields/methods) are given default access modifier (i.e., no modifier), 
//  making them accessible only within the same package.
// 🔑 Default Access:=>
// |--> If you don’t specify any access modifier, Java treats it as default (package-private).
// |--> Accessible only to other classes in the same package.
// |--> Not accessible from classes in other packages.

// 🧠 Use Case
// |->Good for keeping helper classes or internal logic restricted to one package, preventing unwanted external access.
package Encapsulation;

public class PackageEncapsulation {
    String data = "Package-level data"; // default access

    void showData() {
        System.out.println("Data: " + data);
    }
}
