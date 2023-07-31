import java.util.Scanner;
class Book{
      String Bname;
      int Bedition;
      double Bprice;
      Book(){
        System.out.println("Enter the Details of the Book :");
        Scanner sc = new Scanner(System.in);
        Bname = sc.nextLine();
        Bedition = sc.nextInt();
        Bprice = sc.nextDouble();
      }

      void display(){
        System.out.println(Bname+"-"+Bedition+"-"+Bprice);
      }
}//abcdefghijklmnopqrstuvwxyz//


public class HA2Q2 {
    public static void main(String[] args) {
        Book [] A = new Book[5];
        for(int i=0;i<A.length;i++){
            A[i]= new Book();
        }
        for(int i=0;i<A.length;i++){
            System.out.println("The detail of book "+(i+1)+" is ");
            A[i].display();
        }
        double Max_price = A[0].Bprice;
        int index =0;
        for(int i=0;i<A.length;i++){
            if(A[i].Bprice>Max_price){
               index = i;
            }
        }
        System.out.println("The Maximum Price Product Detail is : ");
        A[index].display();

    }
    
}
