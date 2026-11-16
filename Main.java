import java.util.Scanner;

// User-defined exception
class LoanException extends Exception {
    LoanException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter applicant's monthly salary: Rs. ");
            double salary = sc.nextDouble();

            if (salary < 15000) {
                throw new LoanException("Loan Application Rejected: Salary is below Rs. 15,000");
            }

            System.out.println("Loan Application Approved!");
            System.out.println("Applicant is eligible for the loan.");

        } catch (LoanException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
        
        System.out.println("Ishan L. Patil\n1WN25CS096");
    }
}
