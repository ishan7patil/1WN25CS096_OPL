import java.util.Scanner;

class MarksException extends Exception {
   MarksException(String message) {
      super(message);
   }
}

public class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      try {
         System.out.print("eenter student's internal marks (out of 100): ");
         double marks = sc.nextDouble();
         
         if (marks < 40) {
            throw new MarksException("not eligible for examination");
         }
         
         System.out.println("eligible for examination");
      } catch (MarksException e) {
         System.out.println(e.getMessage());
      } catch (Exception e) {
         System.out.println("invalid input!");
      }
      
      sc.close();
      
      System.out.println("Ishan L. Patil\n1WN25CS096");
   }
}