public class HA1Q3 {
    public static int[] dotProduct(int[]a,int[]b){
        int c [] = new int [a.length];
        for(int i=0;i<a.length;i++){
            c[i] = a[i]*b[i];
        }
        return c ;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={5,6,7,8};
        int C [] = dotProduct(A, B);
        for(int i=0;i<A.length;i++){
            System.out.println(C[i]);
        }

    }
    
}
