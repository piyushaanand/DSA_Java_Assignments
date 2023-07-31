import java.util.Scanner;
public class HA1Q4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        int rows = a.length;
        int column = a[0].length;
        if(a.length!=b.length||a[0].length!=b[0].length){
            System.out.println("Error : The Two Matrices has Different Dimensions !");            
        }
        double[][] result = new double [rows][column];
        
            for(int i=0;i<rows;i++){
                for(int j=0;j<column;j++){
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            
            return result;
        
               
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the matrix A: ");
        int r = sc.nextInt();
        System.out.print("Enter the columns of the matrix A: ");
        int c = sc.nextInt();
        double [][]A = new double[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Display the elements of the Matrix A: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the rows of the matrix B : ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of the matrix B : ");
        int columns = sc.nextInt();
        double [][]B = new double[rows][columns];
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                B[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Display the elements of the Matrix B : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
            double [][]C = addMatrix(A,B);
            System.out.println("After addition :");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
    }
    
}
