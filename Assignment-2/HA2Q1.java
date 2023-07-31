import java.util.Scanner;
class Commision{
    double sales ;

    Commision(double sales){
        this.sales = sales;
    }
    public double getCommision(){
        if(sales<0){
            System.out.println("Invalid Input");
            return 0;
        }
        else if(sales<100){
            return 0.02*sales;
        }else if(sales<5000){
            return 0.05*sales;
        }else{
            return 0.08*sales;
        }
    }
}
public class HA2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales : ");
        double sale = sc.nextDouble();
        Commision obj = new Commision(sale);
        double com_amt = obj.getCommision();
        System.out.println("The Commission for the sale "+sale+" is "+com_amt);
    }
}
