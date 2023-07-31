import java.util.Scanner;
public class HA1Q5 {
    public static int largestColumn(int [][]m){
        int columnIndex=0;
        int max =0;
        for(int i=0;i<m[0].length;i++){
            int count=0;
            for(int j=0;j<m.length;j++){
                  if(m[j][i]==1){
                    count++;
                  }
                  if(count>max){
                  max = count ;
                  columnIndex = i;
                  }
            }
        }
        return columnIndex;
    }
    public static int largestRow(int [][]n){
        int rowIndex =0;
        int temp =0;
        for(int i=0;i<n.length;i++){
            int count =0;
            for(int j=0;j<n[i].length;j++){
                if(n[i][j]==1){
                    count++;
                }
                if(count>temp){
                temp=count ;
                rowIndex =i;
                }
            }
        }
        return rowIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        int [][]A = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=0+(int)(Math.random()*(1-0+1));
                System.out.println(A[i][j]);
            }
        }
        System.out.println("Display the Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int larr = largestRow(A);
        int larc = largestColumn(A);
        System.out.println("The Largest row Index : "+larr);
        System.out.println("The Largest Column Index : "+larc);
    }
    
}
