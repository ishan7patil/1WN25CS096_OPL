import java.util.Scanner;

// User-defined exception
class AttendanceException extends Exception {
    AttendanceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's attendance percentage: ");
            double attendance = sc.nextDouble();

            if (attendance < 75) {
                throw new AttendanceException("Insufficient Attendance");
            }

            System.out.println("Attendance is sufficient.");
            System.out.println("Student is eligible for examinations.");

        } catch (AttendanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
        
        System.out.println("Ishan L. Patil\n1WN25CS096");                                                                                                                                                                                                                                                                                                                                                                                                            
    }
}
