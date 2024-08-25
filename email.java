import java.util.*;
public class email {
    public String firstname;
    public String lastname;
    public String password;
    public String department;
    public int mailboxCapacity = 500;
    public int defaultPasswordLength = 10;
    public String alternateEmail;
    public String company = "google.com";
    public String email;

    // Constructor
    public email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = setDepartment();
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        this.email = generateEmailAddress();
        System.out.println("Your email is: " + this.email);
    }

    // Set department
    public String setDepartment() {
        System.out.println("Enter the department\n1: Sales\n2: Development\n3: Accounting");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) {
            return "sales";
        } else if (ch == 2) {
            return "dev";
        } else if (ch == 3) {
            return "acc";
        } else {
            return "Invalid";
        }
    }

    // Generate random password
    public String generateRandomPassword(int length) {
        String passwordSet = "QWERTYUIOPLKJHGFDSAZXCVBNM1234567890@#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Generate email address
    public String generateEmailAddress() {
        return firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + company;
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Get password
    public String getPassword() {
        return password;
    }

    // Show info
    public void showInfo() {
        System.out.println("NAME: " + firstname + " " + lastname);
        System.out.println("COMPANY MAIL: " + email);
        System.out.println("MAILBOX CAPACITY: " + mailboxCapacity + "mb");
    }

    // Main method
    public static void main(String[] args) {
        email e1 = new email("Taiyaba", "Khan");
        e1.showInfo();
    }
}
