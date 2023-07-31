import java.util.Scanner;
public class A3Q7 {
    public static int factNum(int n ){
        if(n==0 || n==1){
            return 1 ;
        }else{
            return  (n*factNum(n-1));
        }
    }

    public static int powerNums(int a , int b ){
        if (b==0){
            return 1 ;
        }else{
            return (a*powerNums(a, b-1));
        }
    }

    public static int gcdNums(int a , int b ){
        if(b==0){
            return a ;

        }else{
            return (gcdNums(a, a%b));
        }
    }

     public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int remainder = decimal % 2;
            return decimalToBinary(decimal / 2) + remainder;
        }
    }

    public static int calculateProduct(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + calculateProduct(num1, num2 - 1);
        } else {
            return -calculateProduct(num1, -num2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1--->Calculate the Factorial of a number .");
            System.out.println("2---> Calculate the Power a to the power b .");
            System.out.println("3---> Calculate the Gcd of two Numbers .");
            System.out.println("4---> convert decimal into Binary .");
            System.out.println("5---> Find the Product of the Two numbers .");
            System.out.println("0---> EXIT");

             ch = sc.nextInt();

            switch(ch){
                  case 1: System.out.println("Enter the Number : ");
                        int num = sc.nextInt();
                        int res = factNum(num);
                        System.out.println("The Factorial of "+num+" is "+res);
                        break;
                   case 2 : System.out.println("Enter the numbers : ");     
                            int a = sc.nextInt();
                            int b = sc.nextInt();
                            int resu = powerNums(a, b);
                            System.out.println(a+" to the Power "+b+" is "+resu);
                            break;
                    case 3 : System.out.println("Enter the Numbers :");
                            int c = sc.nextInt();
                            int d = sc.nextInt();
                            int ans = gcdNums(c, d);
                            System.out.println("Gcd of "+c+" and "+d+" is "+ans);
                            break;
                    case 4 : System.out.println("Enter the Decimal Part : ");        
                             int decimal = sc.nextInt();
                             String answer = decimalToBinary(decimal);
                             System.out.println("The Decimal "+decimal+" is converted to "+answer);
                             break;
                    case 5 : System.out.println("Enter the Numbers :");
                             int num1 = sc.nextInt();
                             int num2 = sc.nextInt();
                             int answ = calculateProduct(num1, num2);
                             System.out.println("The Product of "+num1 +" and "+num2 +" is "+calculateProduct(num1, num2));
                             break;

                    case 0 : System.out.println("Exiting..............."); 
                              break;

                              default:System.out.println("Invalid Choice ........!!!!!!");
                               break;
            }
        }while(ch!=0);
    }
    
}
