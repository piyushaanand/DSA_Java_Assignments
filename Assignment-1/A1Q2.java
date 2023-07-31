import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the Person : ");
        double w = sc.nextDouble();
        System.out.println("Enter the height of the Person : ");
        double h = sc.nextDouble();
        double BMI = w/Math.pow(h,2);
        if(BMI<18.5){
            System.out.println("Underweight !!!");
        }else if(BMI < 24.9){
            System.out.println("Normal Weight !!!");
        }else if(BMI<29.9){
            System.out.println("Over Weight !!!");
        }else{
            System.out.println("Obese !!!");
        }
        sc.close();
    }
    
}
