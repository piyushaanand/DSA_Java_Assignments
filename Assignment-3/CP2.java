import java.util.Scanner;
public class CP2{
    public static <T> void Swap(T a , T b){
        System.out.println("Before Swap a , b are : "+a+"\t"+b);
        T temp ;
        temp = a;
        a= b ;
        b = temp;

        System.out.println("After Swapping a,b are : "+a+"\t"+b);
    }
public static void main(String[] args) {
   Swap(1,2);
}
}
