import java.util.Scanner ;
public class HA3Q2 {
    public static int BinarySearch(int []A , int target , int low , int high ){
        if(low<=high){
            int mid = (low + high )/2;
            if(A[mid]==target){
                return mid ;
            }else if(A[mid]<target){
                return BinarySearch(A, target, mid+1 , high);
            }else{
                return BinarySearch(A, target, low, mid -1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the number of elements of the array : ");
        int num = sc.nextInt();
        int []A = new int[num];
        System.out.println("Enter the elements in Ascending order in the Array : ");
        for(int i=0;i<num;i++){
             A[i]= sc.nextInt();
        }
        System.out.println("Enter the the Number Whose Index is to find : ");
        int target = sc.nextInt();
        int res = BinarySearch(A, target, 0, num-1);
        if(res == -1){
            System.out.println("The number "+target+" is not present in the Arary !!!");

        }else{
            System.out.println("The number "+target+" is Present in the index "+res+" int the Array !!!");
        }
    }
    
}
