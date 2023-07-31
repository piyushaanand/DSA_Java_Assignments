import java.util.Scanner;
class Phone {
    int area_code;
    int exchange;
    int number;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area_code : ");
        area_code = sc.nextInt();
        System.out.print("Enter the exchange : ");
        exchange = sc.nextInt();
        System.out.print("Enter the number : ");
        number = sc.nextInt();
    }

    void display(){
        System.out.print("("+area_code+")"+" "+exchange+"-"+number);
    }
}
public class A2Q1{
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.input();
        System.out.print("My Number is : ");
        p1.display();
    }
}