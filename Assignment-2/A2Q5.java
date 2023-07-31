import java.util.Scanner;
class Deposit{
    long Principal;
    int Time ;
    double rate;
    double Tot_amt;


       Deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details : ");
        Principal = sc.nextLong();
        Time = sc.nextInt();
        rate = sc.nextDouble();

       }

       Deposit(long P , int T , double r){
        Principal = P;
        Time = T;
        rate = r;
       }

       Deposit(long Pr, int Ti){
        Principal = Pr ;
        Time = Ti;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rate : ");
        rate = sc.nextDouble();

       }

       Deposit(long Pr, double ra){
        Principal = Pr ;
        rate = ra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time : ");
        Time = sc.nextInt();
        
       }

       void Calc_amt(){
        Tot_amt = Principal +  (Principal * rate * Time)/100.0;
       }

       void display(){
        System.out.println(Principal+"-"+rate+"-"+Time+"-"+Tot_amt);
       }
    }
public class A2Q5 {
    public static void main(String[] args) {
        Deposit D1 = new Deposit();
        D1.Calc_amt();
        D1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details : ");
        long P = sc.nextLong();
        int T = sc.nextInt();
        double r = sc.nextDouble();
        Deposit D2 = new Deposit( P,  T, r);
        D2.Calc_amt();
        D2.display();
        System.out.println("Enter the Details : ");
        long Pr = sc.nextLong();
        int Ti = sc.nextInt();
        Deposit D3 = new Deposit(Pr,Ti);
        D3.Calc_amt();
        D3.display();
        System.out.println("Enter the Details : ");
        long Pri = sc.nextLong();
        double rat = sc.nextDouble();
        Deposit D4 = new Deposit(Pri,rat);
        D4.Calc_amt();
        D4.display();
    }
    
}
