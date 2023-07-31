import java.util.Scanner;

public class HA1Q1 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      // Input the three integers from the console
      System.out.print("Enter the first integer: ");
      int a = sc.nextInt();

      System.out.print("Enter the second integer: ");
      int b = sc.nextInt();

      System.out.print("Enter the third integer: ");
      int c = sc.nextInt();

      // Check if the three integers can be used in a correct arithmetic formula
      if (a + b == c) {
         System.out.println(a + " + " + b + " = " + c);
      } else if (a == b - c) {
         System.out.println(a + " = " + b + " - " + c);
      } else if (a * b == c) {
         System.out.println(a + " * " + b + " = " + c);
      } else {
         System.out.println("The three integers cannot be used in a correct arithmetic formula.");
      }

      sc.close();
   }
}

