
import java.util.Scanner;

public class EmailOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String validDomain = "bmsce.ac.in";

        // Accept email address
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        // 1. Find length of email
        System.out.println("\nLength of email: " + email.length());

        // 2. Extract username
        int at = email.indexOf('@');
        String username = email.substring(0, at);
        System.out.println("Username: " + username);

        // 3. Extract and compare domain
        String domain = email.substring(at + 1);
        System.out.println("Domain: " + domain);

        if (domain.equalsIgnoreCase(validDomain)) {
            System.out.println("Email belongs to BMSCE.");
        } else {
            System.out.println("Email does not belong to BMSCE.");
        }

        // 4. Convert email to lowercase
        String lowerEmail = email.toLowerCase();
        System.out.println("Lowercase email: " + lowerEmail);

        // 5. Check whether email starts with a given prefix
        System.out.print("\nEnter registration number prefix: ");
        String prefix = sc.nextLine();

        if (email.startsWith(prefix)) {
            System.out.println("Email starts with the given prefix.");
        } else {
            System.out.println("Email does not start with the given prefix.");
        }

        // 6. Check whether email ends with valid domain
        if (email.toLowerCase().endsWith(validDomain)) {
            System.out.println("Email ends with the valid domain.");
        } else {
            System.out.println("Email does not end with the valid domain.");
        }

        // 7. Replace domain
        String updatedEmail = email.replace(validDomain, "cse.bmsce.ac.in");
        System.out.println("Updated email: " + updatedEmail);

        // 8. Check whether email contains a specific sequence
        System.out.print("\nEnter a character or sequence to search: ");
        String search = sc.nextLine();

        if (email.contains(search)) {
            System.out.println("Email contains " + search);
        } else {
            System.out.println("Email does not contain " + search);
        }

        // 9. Remove leading and trailing spaces
        String trimmedEmail = email.trim();
        System.out.println("Trimmed email: " + trimmedEmail);

        // 10. Compare two email addresses ignoring case
        System.out.print("\nEnter another email address: ");
        String email2 = sc.nextLine();

        if (email.trim().equalsIgnoreCase(email2.trim())) {
            System.out.println("Both email addresses are identical.");
        } else {
            System.out.println("Both email addresses are different.");
        }

        sc.close();
    }
}
