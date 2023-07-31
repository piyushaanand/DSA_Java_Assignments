import java.util.Scanner;
public class A1Q10 {
    public static double sumOfColumn(double[][]m,int columnindex){
        int r = m.length;
        int c = columnindex ;
        double sum=0;
        for(int i=0;i<r;i++){
             sum+=m[i][c];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns of the matrix : ");
        int c = sc.nextInt();
        double [][]A = new double[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Display the elements of the Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<c;i++){
            System.out.println("The sum of column "+(i+1)+" is "+sumOfColumn(A,i));
        }
    }
    
}
