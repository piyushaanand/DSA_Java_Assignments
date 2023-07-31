import java.util.Scanner;
public class A1Q5 {
    public static int sumOfDigits(int n){
            // Loop until n is a single digit
            while (n > 9) {
                int sum = 0;
                // Sum up the digits of n
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }
            return n;
        }       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Number = sc.nextInt();
        int res = sumOfDigits(Number);
        System.out.println("Sum of digits of "+Number+" untill the number is a single digit is "+res);
    }
    
}

