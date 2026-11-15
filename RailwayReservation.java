import java.util.Scanner;

// Custom Exception
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    boolean seats[] = new boolean[5];

    void reserveSeat(int seatNo) throws SeatAlreadyBookedException {

        if (seatNo < 1 || seatNo > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }

        if (seats[seatNo - 1]) {
            throw new SeatAlreadyBookedException("Seat already booked!");
        }

        seats[seatNo - 1] = true;
        System.out.println("Seat " + seatNo + " reserved successfully!");
    }
}

public class RailwayReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.print("Enter seat number (1-5): ");
            int seatNo = sc.nextInt();

            r.reserveSeat(seatNo);
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
        
        System.out.println("Name: Ishan L. Patil\nUSN: 1WN25CS096");
    }
}
