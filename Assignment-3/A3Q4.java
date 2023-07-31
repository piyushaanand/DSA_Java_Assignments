import java.util.Scanner;

public class A3Q4 {
    public static <E> void printArray(E []A){
        for(int i =0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Array Elements : ");
        Integer []A = new Integer[5];
        for(int i=0;i<A.length;i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Enter the Integer Array : ");
        printArray(A);

        System.out.println("Enter the Double Array Elements : ");
        Double []B = new Double[5];
        for(int i=0;i<B.length;i++){
            B[i]= sc.nextDouble();
        }
        System.out.println("Enter the DOuble Array : ");
        printArray(B);
    }
}
