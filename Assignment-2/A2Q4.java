import java.util.Scanner;
class Product {
        int Pid;
        double Price;
     static double Total_Price = 0;

        Product(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Pid and Price : ");
            Pid = sc.nextInt();
            Price = sc.nextDouble();
            
        }

        void display(){
            System.out.println(Pid+"-"+Price);
        }
        
}
public class A2Q4 {
    public static void main(String[] args) {
        Product []A = new Product[5];
        for(int i=0;i<A.length;i++){
            A[i]= new Product();
        }
        for(int i=0;i<A.length;i++){
            A[i].display();
        }
        double Tot_Pr =0 ;
         for(int i=0;i<A.length;i++){
            Tot_Pr += A[i].Price;
         }
         System.out.println("Total Price of the Product : "+Tot_Pr);

    }
    
}
