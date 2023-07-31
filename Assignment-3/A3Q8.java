import java.util.Scanner;
public class A3Q8 {

    public static int reverseNum(int num){
        if(num<10){
            return num;
        }
        else{
            int lastDigit = num%10;
            int remaining_digits = num/10;
            return concantate(reverseNum(remaining_digits),lastDigit);
        }
    }
    public static int concantate(int a , int b){
        return Integer.parseInt(String.valueOf(b)+String.valueOf(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        int num = sc.nextInt();
        int res = reverseNum(num);
        System.out.println("The reverse of "+num+" is "+res);
    }
}
