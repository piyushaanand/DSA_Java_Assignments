import java.util.Scanner;
public class A3Q1{
   public static void checkNo(int n){
        if(n<0){
            throw new NumberFormatException("Negative Numbers are not Lucky !");
        }else{
            System.out.println(n+" is the Lucky Number !!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        try{
        checkNo(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally{
            System.out.println(num);
        }
    }
}