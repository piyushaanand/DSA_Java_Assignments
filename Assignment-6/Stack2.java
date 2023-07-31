import java.util.Scanner;
class Node {
    int info ;
    Node next ;


}
public class Stack2 {
    static Scanner sc = new Scanner(System.in);
    public static Node push(Node top){
    
            Node p = new Node();
            System.out.println("Enter the info of p ");
            p.info = sc.nextInt();
            p.next = null;
            if(top==null){
                top=p;
            }else{
                p.next = top;
                top = p ;
            }
            return top;
        }
    

        public static Node pop(Node top){
            if(top==null){
                System.out.println("Stack Underflow !!!!");
            }else if(top.next== null){
                  System.out.println("The Deleted Element is "+top.info);
                  top = null;
            }else{
                System.out.println("The deleted element is "+top.info);
                top = top.next;
            }
            return top;
        }

        public static void Display(Node top){
            if(top==null){
                System.out.println("Nothing to Display ");

            }else{
                Node temp = top;
                while(temp!=null){
                    System.out.print(temp.info);
                    temp= temp.next;
                    if(temp!=null){
                        System.out.print("-->");
                    }
                    System.out.println();
                }
            }
        }
    public static void main(String[]args){
         Node top = null;
         while(true){
            System.out.println("*****MENU*****");
            System.out.println("0.Exit");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("Enter the choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 0 : System.exit(0);
                          break;
                case 1 : System.out.println("Push in the List ");          
                       top=  push(top);
                       break;
                case 2 : System.out.println("Pop from the List ");  
                       top = pop(top);
                       break;
                case 3 : System.out.println("Display");            
                          Display(top);
                          break;
                   default:System.out.println("Wrong choice !!!!");       
                   break;

            }
         }
    }
}
