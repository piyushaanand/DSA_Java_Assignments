import java.util.Scanner;
public class A1Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        double [][]A = new double [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]= sc.nextDouble();
            }
        }
        System.out.println("Display the elements of the Matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(A[i][j]+" ");   
            }
            System.out.println();
        }
        double sum =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=A[i][j];
                }
            }
        }
        System.out.println("The sum of Major diagonals of 2-D Matrix is "+sum);
    }
    
}
