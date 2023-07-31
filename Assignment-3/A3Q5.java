import java.util.Scanner;
public class A3Q5 {
    public static <T> int count(T[] array, T item){
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(item)){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of array and the item to be Searched : ");
        int num = sc.nextInt();
        int item = sc.nextInt();
        Integer [] A = new Integer[num];
        System.out.println("Enter the Elements of the Array : ");
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
            System.out.println(item+" occured "+count(A,item)+" times");
    }
    
}
