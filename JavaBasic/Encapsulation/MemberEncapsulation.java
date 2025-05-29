// Member-Level Encapsulation means:
// |--> Each class member (field/variable) is individually encapsulated.
// |--> Fields are made private.
// |--> Access is controlled through public getters and setters.

package Encapsulation;
public class MemberEncapsulation {
    // Encapsulated (private) member variables
    private String username;
    private String password;

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password with basic validation
    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters.");
        }
    }
}
