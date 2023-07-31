import java.util.Scanner;
public class A1Q6 {
    public static boolean isOdd(int n){
        int r = n&1;
        if(r==1){
            return true ;
        }else{
            return false ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= sc.nextInt();
        boolean res = isOdd(num);
        System.out.println(num+" is odd : "+res);
    }
    
}
