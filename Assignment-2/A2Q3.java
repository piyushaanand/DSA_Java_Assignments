import java.util.Scanner;
class Student{
    int roll;
    String name ;
    double DSA_mark;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details !");
        roll = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        DSA_mark = sc.nextDouble();
    }

    void showData(){
        System.out.println(roll+"-"+name+"-"+DSA_mark);
    }

}
public class A2Q3 {
    public static void main(String[] args) {
        Student[]A = new Student[5];
        for(int i=0;i<A.length;i++){
            A[i]=new Student();
            A[i].getData();
        }
        System.out.println("Info of Five Students : ");
        for(int i=0;i<A.length;i++){
            System.out.println("Info of  Student "+(i+1)+" is : " );
            A[i].showData();
        }
        
        double l = A[0].DSA_mark;
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i].DSA_mark >l){
                index =i;
            }
        }
        System.out.println("The Topper in DSA is ");
        A[index].showData();
    }
    
}
