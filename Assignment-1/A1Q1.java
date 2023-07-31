import java.util.Scanner;
public class A1Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive number greater than 2 : ");
        int num = sc.nextInt();
        int i=0;
        while(num>2){
            i++;
        num = num/2;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+i);
    }
}