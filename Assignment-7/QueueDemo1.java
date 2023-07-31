import java.net.DatagramSocketImplFactory;
import java.util.Scanner;
public class QueueDemo1{
     public static final int MAX = 5;
    public static  int front = -1;
    public static  int rear = -1;
   static Scanner sc = new Scanner(System.in);
      
    public static boolean isFull(){
        return rear == MAX-1;
    }
    public static boolean isEmpty(){
        return front == -1;
    }
                public static void Insert(int []Q){
                if(isFull()){
                    System.out.println("No any element can be entered !!!!");
                }else{
                    System.out.println("Enter the element to Insert : ");
                    int ele = sc.nextInt();
                    rear++;
                    Q[rear]=ele;
                }
                if(rear==0){
                    front =0;
                 }
             }

                public static void Delete(int []Q){
                    if(isEmpty()){
                        System.out.println("Cannot be deleted coz Array is Empty !!!!");
                    }else{
                        System.out.println("The Deleted Element is "+Q[front]);
                        front++;
                    }if(front == MAX){
                        rear = front = -1;
                    }
                }

                public static void Traversal(int []Q){
                    for(int i = front;i<=rear;i++){
                        System.out.println(Q[i]+" ");
                    }
                }
    

    public static void main(String[] args) {
        int []A = new int[MAX];
        while(true){
            System.out.println("*****MENU*****");
            System.out.println("0.Exit");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.DIsplay");
            System.out.println("Enter your Choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 0 : System.exit(0);
                break;

                case 1 : System.out.println("Inserting into the queue : ");
                        Insert(A);
                        break;

                case 2 : System.out.println("Deleting from the queue : ");        
                        Delete(A);
                        break;

                case 3 : System.out.println("Display the queue : ");        
                         Traversal(A);
                         break;

                         default:System.out.println("Wrong Choice !!!!");
                         break;
            }
        }
    }
}