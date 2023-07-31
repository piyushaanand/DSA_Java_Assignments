package Q10A;
import java.util.Scanner;
public class Student {
   public String name ;
   public int roll ;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Roll : ");
        name = sc.nextLine();
        roll = sc.nextInt();
    }

    public void output(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
}
