import java.util.Scanner;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        int [][]Ar = new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Ar[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("Display the elements of the Matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(Ar[i][j]+" ");
               sum+=Ar[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all the elements of the Matrix is : "+sum);
    }
    
}
