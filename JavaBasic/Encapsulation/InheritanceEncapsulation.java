// Inheritance-Based Encapsulation uses the protected access modifier to allow:
// |-> Access to subclasses (child classes) even if they are in different packages.
// |-> Still hides those members from non-subclass classes outside the package.

// 🔑 protected Keyword:
// |-> Accessible within the same package.
// |-> Accessible in subclasses (even from other packages).
// |-> Not accessible to unrelated classes in other packages.


package Encapsulation;

import Encapsulation.Parent.Parent;

public class InheritanceEncapsulation extends Parent {
    public void accessProtectedData() {
        // Accessing protected member from superclass
        System.out.println("Accessing from ChildClass:");
        showProtectedMessage(); // Calling protected method
    }
}
