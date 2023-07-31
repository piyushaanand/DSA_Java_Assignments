import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int sum=0;
        int product =1;
        for(int i=0;i<s.length();i++){
            int digit = Character.getNumericValue(s.charAt(i));
            sum+=digit;
            product*=digit;
        }
        if(sum==product){
            System.out.println(num +" is a Spy Number !!!");
        }else{
            System.out.println(num+" is not a Spy number !!!");
        }
    }
}
